public abstract class Jedi extends Forca {
    public Jedi(int forca, int vida, String nome) {
        super(forca, vida, "Jedi", nome);
    }

    public void atacar(Forca f) {
        f.setVida(f.getVida() - this.getForca());
        System.out.println(this.getGenero() + " " + this.getNome() + " atacou " + f.getNome() + " e causou " + this.getForca() + " de dano!");
    }
}
