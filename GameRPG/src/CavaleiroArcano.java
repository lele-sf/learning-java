public class CavaleiroArcano extends Guerreiro {
    public CavaleiroArcano(String nome, int vida, int poderAtaque) {
        super(nome, vida, poderAtaque);
    }

    @Override
    public void atacar(Personagem p) {
        super.atacar(p);
        System.out.println(getNome() + " usa magia para aprimorar o ataque!");
    }
}
