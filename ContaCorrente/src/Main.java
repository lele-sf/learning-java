public class Main {
    public static void main(String[] args) {
    ContaCorrente myConta = new ContaCorrente("Jane",12345,10,50);
    myConta.deposito(200);
    myConta.exibirDados();
    myConta.saque(50);
    myConta.exibirDados();

    ContaCorrente c2 = new ContaCorrente("John", 54321, 500);
    c2.exibirDados();

    ContaCorrente c3 = new ContaCorrente("Homer", 6789);
    c3.exibirDados();
    }
}