package atleta;

import java.util.Scanner;

public class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoKg;
    private double alturaM;


    public Atleta() {
        nome = "não definido";
        modalidade = "não definido";
        idade = 0;
        pesoKg = 0.0;
        alturaM = 0.0;

    }

    public Atleta(String nome, String modalidade, int idade, double pesoKg, double alturaM) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesoKg = pesoKg;
        this.alturaM = alturaM;
    }

    public String getNome() {
        return nome;
    }
    public String getModalidade() {
        return modalidade;
    }
    public int getIdade() {
        return idade;
    }
    public double pesoKg() {
        return pesoKg;
    } 
    public void setNome(Scanner teclado) { 
        String novoNome = teclado.nextLine();
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido");
        }
    }
    public void setModalidade(Scanner teclado) { 
        String novaModal = teclado.nextLine();
        if (novaModal != null && !novaModal.isEmpty()) {
            this.modalidade = novaModal;
        } else {
            System.out.println("Modalidade inválida");
        }
    }
    public void setQuant(Scanner teclado) {
        int novaQuant = teclado.nextInt();
        if (quant >= 0) { 
            this.quant = quant + novaQuant;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }
    public void setPrecoUnit(Scanner teclado) {
        Double novoPreco = teclado.nextDouble();
        if (precoUnit >= 0) { 
            this.precoUnit = novoPreco;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }
    public void adicionarEstoque(int quant, Scanner teclado) {
        int novaQuant = teclado.nextInt();
        if (novaQuant >= 0){
            quant = quant + novaQuant;
            System.out.println(quant + "produto(s) " + nome + "foi(ram) adicionado(s) no estoque.");
        } else {
            System.out.println("Quantidade inválida.");
        }
        
    }

    public void removerEstoque(int quant, Scanner teclado) {
        int novaQuant = teclado.nextInt();
        if (novaQuant <= 0){
            quant = quant + novaQuant;
            System.out.println(quant + "produto(s) " + nome + "foi(ram) removido(s) do estoque.");
        } else {
            System.out.println("Quantidade inválida.");
    }

}
}