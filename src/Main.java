import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Catálogo do app
        ArrayList<Midia> catalogo = new ArrayList<>();
        catalogo.add(new Musica("Evidências", 4, "Chitãozinho & Xororó"));
        catalogo.add(new Musica("Garota de Ipanema", 3, "Tom Jobim"));
        catalogo.add(new Podcast("Nerdcast #1", 60, "Jovem Nerd"));
        catalogo.add(new Podcast("Flow #10", 90, "Igor 3K"));

        System.out.print("Digite seu nome: ");
        Usuario usuario = new Usuario(sc.nextLine());

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== SPOTIFY - Olá, " + usuario.getNome() + " ===");
            System.out.println("1 - Listar catálogo");
            System.out.println("2 - Criar playlist");
            System.out.println("3 - Adicionar item à playlist");
            System.out.println("4 - Ver playlists");
            System.out.println("5 - Tocar playlist");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                for (int i = 0; i < catalogo.size(); i++) {
                    System.out.println((i + 1) + " - " + catalogo.get(i));
                }
            } else if (opcao == 2) {
                System.out.print("Nome da playlist: ");
                usuario.criarPlaylist(sc.nextLine());
            } else if (opcao == 3) {
                System.out.print("Nome da playlist: ");
                Playlist p = usuario.buscarPlaylist(sc.nextLine());
                if (p == null) {
                    System.out.println("Playlist não encontrada.");
                } else {
                    for (int i = 0; i < catalogo.size(); i++) {
                        System.out.println((i + 1) + " - " + catalogo.get(i));
                    }
                    System.out.print("Número do item: ");
                    int n = Integer.parseInt(sc.nextLine());
                    if (n >= 1 && n <= catalogo.size()) {
                        p.adicionar(catalogo.get(n - 1));
                    } else {
                        System.out.println("Item inválido.");
                    }
                }
            } else if (opcao == 4) {
                for (Playlist p : usuario.getPlaylists()) {
                    p.listar();
                }
            } else if (opcao == 5) {
                System.out.print("Nome da playlist: ");
                Playlist p = usuario.buscarPlaylist(sc.nextLine());
                if (p == null) {
                    System.out.println("Playlist não encontrada.");
                } else {
                    p.tocar();
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        }
        System.out.println("Até logo!");
    }
}