package musicas;

public  class Musicas {
    private String nome = "não definido";
    private String artista = "não definido";
    private double duracao = 0.0;
    private String album = "não definido";
    private int ano = 0;
    //construtor
    public Musicas(String nome, String artista, double duracao, String album, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.album = album;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public double getDuracao() {
        return duracao;
    }
    public String getAlbum() {
        return album;
    }
    public int getAno() {
        return ano;
    }    

    public void setNome(String nome) {
            this.nome = nome;

    }
    public void setArtista(String artista) {
            this.artista = artista;

    }
    public void setDuracao(double duracao) {
            this.duracao = duracao;
    }

    public void setAlbum(String album) {
            this.album = album;

    }
    public void setAno(int Ano) {
            this.ano = ano;
    }

    public void tocarMusica() {
        System.out.println("Agora está tocando " + nome + " do artista " + artista);
    }
    public void infoMusica() {
        System.out.println("Música: " + nome + " de " + artista + " do álbum " + album + ", " + ano + ", com duração de " + duracao + " minutos.");
    }
}
