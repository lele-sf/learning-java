import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** ABERTURA DA CONTA CORRENTE ****");

        System.out.print("Numero da conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Titular: ");
        String titular = scanner.nextLine();

        System.out.print("Valor inicial: R$");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Limite: R$");
        double limite = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("******** ABERTURA ENCERRADA ********");

        ContaCorrente conta = new ContaCorrente(titular, numConta, saldo, limite);

        boolean executando = true;
        while (executando) {
            System.out.println("\n******* MOVIMENTACAO DA CONTA *******");
            conta.exibirDados();
            System.out.println("=====================================");
            System.out.println("1. Saque");
            System.out.println("2. Deposito");
            System.out.println("3. Saldo");
            System.out.println("4. Sair");
            System.out.println("=====================================");
            System.out.print("Selecione opcao: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a quantidade do saque: ");
                    double saqueQuant = scanner.nextDouble();
                    conta.saque(saqueQuant);
                    break;
                case 2:
                    System.out.print("Digite a quantidade do deposito: ");
                    double depositoQuant = scanner.nextDouble();
                    conta.deposito(depositoQuant);
                    break;
                case 3:
                    conta.verSaldo();
                    break;
                case 4:
                    executando = false;
                    break;  
                default:
                    System.out.println("Opcao invalida. Tente novamente!");
            }
        }
        scanner.close();
    }
}
