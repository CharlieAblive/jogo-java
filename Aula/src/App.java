import java.util.Scanner;
import atleta.Atleta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Atleta atleta1 = new Atleta();
        int opcao;
        do {
            System.out.println("= Gerenciamento Atletas =");
            System.out.println("1- Cadastrar novo atleta");
            System.out.println("2- Calcular IMC");
            System.out.println("3- Verificar Categoria");
            System.out.println("4- Atualizar informações");
            System.out.println("5- Sair");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Nome: ");
                atleta1.setNome(teclado2);
                System.out.println("Idade: ");
                atleta1.setIdade(teclado);
                System.out.println("Modalidade: ");
                atleta1.setModalidade(teclado2);
                System.out.println("Peso(Kg): ");
                atleta1.setPesoKg(teclado);
                System.out.println("Altura(m) ");
                atleta1.setAlturaM(teclado);

                System.out.println("Atleta cadastrado com sucesso.");
            } else if (opcao == 2) {
                atleta1.calcularIMC();
            } else if (opcao == 3) {
                atleta1.classificCate();
            } else if (opcao == 4) {
                System.out.println("Novas informações Atleta: ");
                System.out.println("Nome: ");
                atleta1.setNome(teclado2);
                System.out.println("Modalidade: ");
                atleta1.setModalidade(teclado2);
                System.out.println("Peso(Kg): ");
                atleta1.setPesoKg(teclado);
                System.out.println("Altura(m) ");
                atleta1.setAlturaM(teclado);

                System.out.println("Informações atualizadas com sucesso.");
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opçao inválida.");

            }
        } while (opcao != 0);

    }
    
}