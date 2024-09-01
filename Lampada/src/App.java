public class App {
    public static void main(String[] args) throws Exception {
        Lampada myLampada = new Lampada();
        Lampada myLampada2 = new Lampada();

        myLampada.liga();
        System.out.println(myLampada.observa());

        myLampada2.desliga();
        System.out.println(myLampada2.observa());
    }
}
