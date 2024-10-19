public abstract class Sith extends Forca {
    public Sith(int forca, int vida, String nome) {
        super(forca, vida, "Sith", nome);
    }

    public void atacar(Forca f) {
        f.setVida(f.getVida() - this.getForca());
        System.out.println(this.getGenero() + " " + this.getNome() + " atacou " + f.getNome() + " e causou " + this.getForca() + " de dano!");
    }
}
