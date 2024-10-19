public class App {
    public static void main(String[] args) throws Exception {
        MestreJedi yoda = new MestreJedi(150, "Yoda");
        MestreSith darthSidious = new MestreSith(200, "Darth Sidious");
        Lord vader = new Lord(180, "Darth Vader");
        Cavaleiro obiWan = new Cavaleiro(120, "Obi-Wan Kenobi");

        yoda.atacar(darthSidious);
        vader.atacar(obiWan);

        yoda.usarRaio();

        System.out.println("Vida de Darth Sidious: " + darthSidious.getVida());
        System.out.println("Vida de Obi-Wan: " + obiWan.getVida());

    }
}
