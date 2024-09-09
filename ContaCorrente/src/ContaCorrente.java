public class ContaCorrente {
    private int numConta;
    private String titular;
    private double saldo;
    private double limite;
    
    public ContaCorrente(String titular, int numConta, double saldo, double limite){
        setTitular(titular);
        if(numConta < 0) {
            System.out.println("Numero invalido!");
        } else {
            setNumConta(numConta);
        }
        if(saldo < 0) {
            System.out.println("Saldo invalido!");
        } else {
            setSaldo(saldo);
        }
        if (limite < 0) {
            System.out.println("Numero invalido!");
        } else {
            setLimite(limite);
        }
    }
    public ContaCorrente(String titular, int numConta, double saldo) {
        setTitular(titular);
        if(numConta < 0) {
            System.out.println("Numero invalido!");
        } else {
            setNumConta(numConta);
        }
        if(saldo < 0) {
            System.out.println("Saldo invalido!");
        } else {
            setSaldo(saldo);
        }
        setLimite(100);
    }
    public ContaCorrente(String titular, int numConta) {
        setTitular(titular);
        if(numConta < 0) {
            System.out.println("Numero invalido!");
        } else {
            setNumConta(numConta);
        }
        setSaldo(0);
        setLimite(0);
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void deposito(double valor) {
        if (valor < 0) {
            System.out.println("Nao pode depositar valor negativo!");
        } else {
            this.setSaldo(this.getSaldo()+valor);
        }
    }
    public void saque(double valor) {
        if (valor < 0) {
            System.out.println("Nao pode sacar valor negativo!");
        } else {
            if (valor > this.getSaldo() + this.getLimite())
                System.out.println("Recurso insuficiente!");
            else
            this.setSaldo(this.getSaldo()-valor);
        }
    }
    public void exibirDados() {
        System.out.println("=====================================");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("=====================================");
    }

    public void verSaldo() {
        System.out.println("=====================================");
        System.out.printf("Saldo: R$ %.2f\n", getSaldo());
        System.out.printf("Limite: R$ %.2f\n", getLimite());
        System.out.println("=====================================");
    }
}

