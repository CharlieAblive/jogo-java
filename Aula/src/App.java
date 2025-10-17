import java.util.Scanner;
import veiculos.Veiculos;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Veiculos veiculo1 = new Veiculos();
        int opcao;
        do {
            System.out.println("= Gerenciamento de Veículos =");
            System.out.println("1- Cadastrar novo veículo");
            System.out.println("2- Atualizar quilometragem");
            System.out.println("3- Calcular idade");
            System.out.println("4- Exibir informações");
            System.out.println("5- Sair");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Marca: ");
                veiculo1.setMarca(teclado2);
                System.out.println("Modelo: ");
                veiculo1.setModelo(teclado);
                System.out.println("Ano: ");
                veiculo1.setAno(teclado2);
                System.out.println("Quilom: ");
                veiculo1.setQuilom(teclado);

                System.out.println("veículo cadastrado com sucesso.");
            } else if (opcao == 2) {
                veiculo1.atualizarQuilom(teclado);
            } else if (opcao == 3) {
                veiculo1.calcularIdadeVeiculo();
            } else if (opcao == 4) {
                System.out.println("Informações veículo: ");
                System.out.println("Marca: " + veiculo1.getMarca());
                System.out.println("Modelo: " + veiculo1.getModelo());
                System.out.println("Quilometragem: " + veiculo1.getQuilom());
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opçao inválida.");

            }
        } while (opcao != 0);

    }
    
}