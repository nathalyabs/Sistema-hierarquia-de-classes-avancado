import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Midia> itens = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Midia m) {
        itens.add(m);
        System.out.println("Adicionado: " + m);
    }

    public void listar() {
        System.out.println("Playlist: " + nome);
        if (itens.isEmpty()) {
            System.out.println("  (vazia)");
        }
        for (Midia m : itens) {
            System.out.println("  - " + m);
        }
    }

    public void tocar() {
        System.out.println("Tocando playlist " + nome);
        for (Midia m : itens) {
            m.tocar(); // polimorfismo
        }
    }
}
