package livroJava; 

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int quantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantPaginas = quantPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public int getQuantPaginas() {
        return quantPaginas;
    }

    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setAutor(String autor){
        if (autor != null && !autor.isEmpty()){
            this.autor = autor;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public void setQuantPaginas(int quantPaginas){
        this.quantPaginas = quantPaginas;
    }

    public void calcularTempoLeitura() {
        System.out.println("O tempo de leitura do livro " + titulo + " é " + quantPaginas + " minutos.");
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Publicado em: " + anoPublicacao);
        System.out.println(quantPaginas + " páginas");

    }
}