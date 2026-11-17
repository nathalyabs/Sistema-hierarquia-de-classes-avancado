public abstract class Midia {
    protected String titulo;
    protected int duracao; // em minutos

    public Midia(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public abstract void tocar();

    public String toString() {
        return titulo + " (" + duracao + " min)";
    }
}