import java.util.Scanner;
import animais.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Animal cachorro = new Animal();
        int opcao;
        do {
            System.out.println("= Gerenciamento de  Animais=");
            System.out.println("1- Cadastrar novo animal");
            System.out.println("2- Atualizar peso");
            System.out.println("3- Calcular idade em anos humanos");
            System.out.println("4- Exibir informações");
            System.out.println("5- Verificar porte");
            System.out.println("6- Sair");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Nome: ");
                cachorro.setNome(teclado2);
                System.out.println("Espécie: ");
                cachorro.setEspecie(teclado2);
                System.out.println("Idade: ");
                cachorro.setIdade(teclado);
                System.out.println("Peso(Kg): ");
                cachorro.setPesoKg(teclado);

                System.out.println( "Animal cadastrado com sucesso.");
                } else if (opcao == 2) {
                    cachorro.atualizarPeso(teclado);      
                } else if (opcao == 3) {
                    cachorro.calcularIdadeAnosHumanos();
                } else if (opcao == 4) {
                    cachorro.atualizarPeso(teclado);
                } else if (opcao == 5) {
                    cachorro.classificarPorte();
                } else if (opcao == 6) {
                    break;
                } else {
                    System.out.println("Opçao inválida.");

            }
        } while (opcao != 0);

    }
    
}