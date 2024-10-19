public class Necromante extends Mago {
    public Necromante(String nome, int vida, int poderAtaque) {
        super(nome, vida, poderAtaque);
    }

    @Override
    public void atacar(Personagem p) {
        super.atacar(p);
        System.out.println(getNome() + " usa magia negra para drenar vida!");
    }
}
