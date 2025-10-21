package musicas;
public class OstJogo extends Musicas{
    String jogo;
    public OstJogo(String nome, String artista, double duracao, String album, int ano, String jogo) {
        super(nome, artista, duracao, album, ano);
    }

    public void infoMusica() {
        System.out.println("Música: " + getNome() + " de " + getArtista() + " do álbum " + getAlbum() + ", " + getAno()+ ", com duração de " + getDuracao() + " minutos. Do jogo " + jogo);
    }

}
