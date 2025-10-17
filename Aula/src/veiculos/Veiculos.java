package veiculos;
import java.util.Scanner;

public class Veiculos {
    private String modelo;
    private String marca;
    private int ano;
    private double quilom;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    public Veiculos() {
        marca = "não definido";
        modelo = "não definido";
        ano = 0;
        quilom = 0.0;

    }

    public Veiculos(String marca, String modelo, int ano, double quilom) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilom = quilom;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getQuilom() {
        return quilom;
    } 
    public void setMarca(Scanner teclado) { 
        String novoMarca = teclado2.nextLine();
        if (novoMarca != null && !novoMarca.isEmpty()) {
            this.marca = novoMarca;
        } else {
            System.out.println("Marca inválida");
        }
    }
    public void setModelo(Scanner teclado) { 
        String novoModelo = teclado2.nextLine();
        if (novoModelo != null && !novoModelo.isEmpty()) {
            this.modelo = novoModelo;
        } else {
            System.out.println("Modelo inválida");
        }
    }

    public void setAno(Scanner teclado) {
        int novaAno = teclado.nextInt();
        if (novaAno >= 0) { 
            this.ano = novaAno;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void setQuilom(Scanner teclado) {
        Double novoQuilom = teclado.nextDouble();
        if (novoQuilom >= 0) { 
            this.quilom = novoQuilom;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void calcularIdadeVeiculo() {
        int idade = 2025 - ano;
        System.out.println("A idade do carro é " + idade);
    }

    public void atualizarQuilom(Scanner teclado) {
        System.out.println("Informe a nova quilometragem");
        Double novoQuilom = teclado.nextDouble();
        if (novoQuilom >= 0) { 
            this.quilom = novoQuilom;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void exibirInfo() {
        System.out.println("O modelo é " + modelo);
        System.out.println("A marca é " + marca);
        System.out.println("O ano é " + ano);
        System.out.println("A quilometragem é " + quilom);
    }
}
