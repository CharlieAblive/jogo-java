package musicas;
import java.util.Scanner;

public  class Musicas {
    private String nome;
    private String artista;
    private double duracao;
    private String album;
    private int ano;
    Scanner teclado1 = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    //construtor
    public Musicas(String nome, String artista, double duracao, String album, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.album = album;
        this.ano = ano;
    }

    public double getNome() {
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
        novoNome = teclado1.nextLine();
        if (novoNome != null && !novoNome.isEmpty()) {
            this.novoNome = nome;
        } else {
            System.out.println("");
        }
    }
    public void setArtista(String artista) {
        novoArtista = teclado1.nextLine();
        if (novoArtista != null && !novoArtista.isEmpty()) {
            this.novoArtista = artista;
        } else {
            System.out.println("");
        }
    }
    public void setDuracao(double duracao) {
        novaDuracao = teclado2.nextDouble();
            this.novaDuracao = duracao;
    }

    public void setAlbum(String album) {
        novoAlbum = teclado1.nextLine();
        if (novoAlbum != null && !novoAlbum.isEmpty()) {
            this.novoAlbum = album;
        } else {
            System.out.println("");
        }
    }
    public void setAno(int Ano) {
        novoAno = teclado2.nextInt();
            this.novoAno = ano;
    }
}


public class Rock extends Musicas {
    puclic Rock(String nome, String artista)
}