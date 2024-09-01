public class Lampada {
    private boolean ligada;

    public void liga() {
        ligada = true;
    }

    public void desliga() {
        ligada = false;
    }

    public String observa() {
        if (ligada) {
            return "ligada";
        } else {
            return "desligada";
        }
    }
}
