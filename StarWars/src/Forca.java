public abstract class Forca {
    private int forca;
    private int vida;
    private String genero;
    private String nome;

    public Forca(int forca, int vida, String genero, String nome) {
        setForca(forca);
        setVida(vida);
        setGenero(genero);
        setNome(nome);
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void atacar(Forca f);
}
