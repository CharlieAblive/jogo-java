import produtoJava.Produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto("ProdutoTeste", "CodigoTeste", 100, 20.00);

        int opcao;
        do {
            System.out.println("= Menu de controle =");
            System.out.println("1- Cadastrar novo produto");
            System.out.println("2- Adicionar estoque");
            System.out.println("3- Remover do estoque");
            System.out.println("4- Calcular valor do estoque");
            System.out.println("5- Sair");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Informações do novo produto: ");
                System.out.println("Nome: ");
                produto.setNome(teclado);
                System.out.println("Código: ");
                produto.setCodigo(teclado);
                System.out.println("Quantidade: ");
                produto.setQuant(teclado);
                System.out.println("Preço Unitário: ");
                produto.setPrecoUnit(teclado);

                System.out.println("Produto cadastrado com sucesso.");
            } else if (opcao == 2) {
                System.out.print("Quantidade a ser adicionada: ");
                produto.adicionarEstoque(0, teclado);
            } else if (opcao == 3) {
                System.out.print("Quantidade a ser removida: ");
                produto.adicionarEstoque(0, teclado);
            } else if (opcao == 4) {
                int quanti = produto.getQuant();
                System.out.println(quanti + "produtos no estoque.");
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opçao inválida.");

            }
        } while (opcao != 0);

    }
    
}