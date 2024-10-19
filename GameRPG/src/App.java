import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem cavaleiro = new CavaleiroArcano("Cavaleiro Arcano", 100, 15);
        Personagem necromante = new Necromante("Necromante", 80, 20);

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (cavaleiro.estaVivo() && necromante.estaVivo()) {
            System.out.println("\nEscolha sua acao: (1) Atacar (2) Curar");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                cavaleiro.atacar(necromante);
            } else if (escolha == 2) {
                cavaleiro.curar();
            } else {
                System.out.println("Escolha invalida. Tente novamente.");
                continue;
            }

            if (necromante.estaVivo()) {
                int acaoOponente = rand.nextInt(2); 
                System.out.println("\nA vez do Necromante:");
                if (acaoOponente == 0) {
                    necromante.atacar(cavaleiro);
                } else {
                    necromante.curar();
                }
            }

            System.out.printf("\n%s Vida: %d\n", cavaleiro.getNome(), cavaleiro.getVida());
            System.out.printf("%s Vida: %d\n", necromante.getNome(), necromante.getVida());
        }

        if (cavaleiro.estaVivo()) {
            System.out.println("\nCavaleiro Arcano vence!");
        } else {
            System.out.println("\nNecromante vence!");
        }

        scanner.close();
    }
}
