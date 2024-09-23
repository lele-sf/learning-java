// Interface
interface Voador {
    void voar(); // método sem corpo
}

abstract class Animal {
    public void respirar() {
        System.out.println("O animal esta respirando.");
    }
}

abstract class Mamifero extends Animal {
    // Atributos e métodos específicos de mamíferos
}

class Morcego extends Mamifero implements Voador {
    @Override
    public void voar() {
        System.out.println("O morcego esta voando.");
    }
}

abstract class Ave extends Animal implements Voador {
    @Override
    public void voar() {
        System.out.println("A ave esta voando.");
    }
}

public class Interface {
    public static void main(String[] args) throws Exception {
        Morcego morcego = new Morcego();
        morcego.voar();
        morcego.respirar();
    }
}
