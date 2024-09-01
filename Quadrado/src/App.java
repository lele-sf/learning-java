public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(6);
        Quadrado q3 = new Quadrado(10);

        System.out.println("Area Q1: "+q1.area());
        System.out.println("Perimetro Q2: "+q2.perimetro());
        System.out.println("Lado Q3: "+q3.getLado());
    }
}
