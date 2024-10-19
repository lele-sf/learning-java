public abstract class Personagem {
    private String nome;
    private int vida;
    private int poderAtaque;

    public Personagem(String nome, int vida, int poderAtaque) {
        setNome(nome);
        setVida(vida);
        setPoderAtaque(poderAtaque);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getPoderAtaque() {
        return poderAtaque;
    }
    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public abstract void atacar(Personagem p);
    public abstract void curar();
}
