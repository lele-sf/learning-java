import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** CALCULADORA *****");

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        Calculadora calc = new Calculadora(num1, num2);

        boolean executando = true;
        while (executando) {
            System.out.println("=====================================");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Atualizar numeros");
            System.out.println("6. Sair");
            System.out.println("=====================================");
            System.out.print("Selecione opcao: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int somaResult = calc.soma(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("+", somaResult));
                    break;
                case 2:
                    int subtraiResult = calc.subtraia(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("-", subtraiResult));
                    break;
                case 3:
                    try {
                        int divideResult = calc.divida(calc.getNum1(), calc.getNum2());
                        System.out.println("Resultado: " + calc.exibirOperacao("/", divideResult));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    int multiplicaResult = calc.multiplique(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("*", multiplicaResult));
                    break;
                case 5:
                    System.out.print("Digite o novo primeiro numero: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    calc.setNum1(num1);

                    System.out.print("Digite o novo segundo numero: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    calc.setNum2(num2);
                    break;
                case 6:
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}