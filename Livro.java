public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    int quantPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int quantPaginas) {
        this.titulo = "não definido";
        this.autor = "não definido";
        this.anoPublicacao = 0;
        this.quantPaginas = 0;
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
        double tempoPagina = 0.2;
        double tempoLeitura = quantPaginas * tempoPagina;
        System.out.println("O tempo de leitura do livro " + titulo + " é " + tempoLeitura + " minutos.");
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Publicado em: " + anoPublicacao);
        System.out.println(quantPaginas + " páginas");

    }
}
