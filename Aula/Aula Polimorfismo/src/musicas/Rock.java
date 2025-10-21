package musicas;
public class Rock extends Musicas{
    int BPM = 0;
    public Rock(String nome, String artista, double duracao, String album, int ano, int BPM) {
        super(nome, artista, duracao, album, ano);
    }

    public void infoMusica() {
        System.out.println("Música: " + getNome() + " de " + getArtista() + " do álbum " + getAlbum() + ", " + getAno()+ ", com duração de " + getDuracao() + " minutos e tem um BPM de " + BPM);
    }

    public void frenetico() {
                if (BPM >= 120) {
            System.out.println("Frenetico");
        } else {
            System.out.println("Rock lento...");
        } 
    }
}
