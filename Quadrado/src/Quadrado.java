public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(this.getLado(), 2);
    }

    public double perimetro() {
        return 4 * this.getLado();
    }
}
