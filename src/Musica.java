class Musica extends Midia {
    private String artista;

    public Musica(String titulo, int duracao, String artista) {
        super(titulo, duracao);
        this.artista = artista;
    }

    public void tocar() {
        System.out.println("♪ Tocando música: " + titulo + " - " + artista);
    }
}