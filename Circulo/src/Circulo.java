import java.lang.Math;

public class Circulo {
    private double raio;

    // Constructor
    public Circulo(double raio) {
        this.setRaio(raio);
    }

    // Getter
    public double getRaio() {
        return raio;
    }

    // Setter
    public void setRaio(double raio) {
        if (raio < 0) 
            System.out.println("O raio nao pode ser negativo!");
        else
            this.raio = raio;
    }

    public double diametro() {
        return (2 * this.getRaio());
    }

    public double area() {
        return (Math.PI * Math.pow(this.getRaio(), 2));
    }

    public double circunferencia() {
        return (2 * Math.PI * this.getRaio());
    }

    public void exibeRaio() {
        System.out.println("=======================");
        System.out.printf("Raio: %.2f%n", this.getRaio());
        System.out.printf("Diametro: %.2f%n", this.diametro());
        System.out.printf("Area: %.2f%n", this.area());
        System.out.printf("Circunferencia: %.2f%n", this.circunferencia());
        System.out.println("=======================");
    }
}