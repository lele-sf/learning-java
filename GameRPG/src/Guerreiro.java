import java.util.Random;

public abstract class Guerreiro extends Personagem implements Jogavel {
    public Guerreiro(String nome, int vida, int poderAtaque) {
        super(nome, vida, poderAtaque);
    }

    @Override
    public void curar() {
        Random rand = new Random();
        int valorCura = rand.nextInt(10) + 1;
        setVida(getVida() + valorCura);
        System.out.println(getNome() + " se cura em " + valorCura + " de vida.");
    }

    @Override
    public void atacar(Personagem p) {
        Random rand = new Random();
        int dano = rand.nextInt(getPoderAtaque()) + 1;
        p.receberDano(dano);
        System.out.println(getNome() + " ataca " + p.getNome() + " causando " + dano + " de dano.");
    }

    @Override
    public void jogarTurno(Personagem oponente) {
        atacar(oponente);
    }
}
