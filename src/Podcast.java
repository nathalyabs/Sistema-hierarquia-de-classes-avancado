public class Podcast extends Midia {
    private String apresentador;

    public Podcast(String titulo, int duracao, String apresentador) {
        super(titulo, duracao);
        this.apresentador = apresentador;
    }

    public void tocar() {
        System.out.println("🎙 Tocando podcast: " + titulo + " com " + apresentador);
    }
}