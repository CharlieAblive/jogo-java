import produtoJava.Produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto("ProdutoTeste", "CodigoTeste", 100, 20.00);

            do {
        System.out.println("= Menu de controle =");
        System.out.println("1- Cadastrar novo produto");
        System.out.println("2- Adicionar estoque");
        System.out.println("3- Remover do estoque");
        System.out.println("4- Calcular valor do estoque");
        System.out.println("5- Sair");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.println("Informações do novo produto: ");
            System.out.println("Nome: ");
            
            System.out.println("Código: ");
            System.out.println("Quantidade: ");
            System.out.println("Preço Unitário: ");
        } else if (opcao == 2) {
            
        } else if (opcao == 3) {
            
        } else if (opcao == 4) {
            
        } else if (opcao == 5) {
            
        } else {

        }
    } while (opcao != 0);

    }
    
}