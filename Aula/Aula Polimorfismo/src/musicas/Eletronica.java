package musicas;
public class Eletronica extends Musicas{
    boolean synth = true;
    String gostoSynth;
    public Eletronica(String nome, String artista, double duracao, String album, int ano, boolean synth) {
        super(nome, artista, duracao, album, ano);
    }
    public void temSynth() {
        if (synth == true) {
            gostoSynth = "Tem synth";
        } else {
            gostoSynth = "Não tem synth";
        } 
    }
    public void infoMusica() {
        System.out.println("Música: " + getNome() + " de " + getArtista() + " do álbum " + getAlbum() + ", " + getAno()+ ", com duração de " + getDuracao() + " minutos. " + gostoSynth);
    }

}
