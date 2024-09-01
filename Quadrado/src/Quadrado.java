// Escreva uma classe Quadrado com atributo
// lado do tipo double. A classe deve ter um
// construtor que recebe como parâmetro o
// lado do quadrado. Deve também ter os
// métodos area() e perimetro() que retornam
// respectivamente a área e o perímetro do
// quadrado, cujas fórmulas são as seguintes:
// area=lado2
//  perimetro=4*lado

// Crie 3 objetos e use seus métodos
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
