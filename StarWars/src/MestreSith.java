public class MestreSith extends Sith implements Raios{
    public MestreSith(int vida, String nome) {
        super(120, vida, nome);
    }

    public void usarRaio() {
        System.out.println(this.getGenero() + " " + this.getNome() + " esta usando raios de cor " + cor + " com forca extra de " + forcaExtra);
    }
}
