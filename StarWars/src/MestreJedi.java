public class MestreJedi extends Jedi implements Raios {
    public MestreJedi(int vida, String nome) {
        super(100, vida, nome);
    }

    public void usarRaio() {
        System.out.println(this.getGenero() + " " + this.getNome() + " esta usando raios de cor " + cor + " com forca extra de " + forcaExtra);
    }
}
