import livroJava.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Alice no País das Maravilhas", "Lewis Carroll", 1985, 208);

        livro1.calcularTempoLeitura();
        livro1.exibirInfo();
    }
    
}