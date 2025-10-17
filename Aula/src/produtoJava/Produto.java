package produtoJava;

import java.util.Scanner;

public class Produto {
    private String nome;
    private String codigo;
    private int quant;
    private double precoUnit;


    public Produto() {
        nome = "não definido";
        codigo = "não definido";
        quant = 0;
        precoUnit = 0.0;

    }

    public Produto(String nome, String codigo, int quant, double precoUnit) {
        this.nome = nome;
        this.codigo = codigo;
        this.quant = quant;
        this.precoUnit = precoUnit;
    }

    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getQuant() {
        return quant;
    }
    public double getPrecoUnit() {
        return precoUnit;
    } 
    public void setNome(Scanner teclado) { 
        String novoNome = teclado.nextLine();
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("nome inválido");
        }
    }
    public void setCodigo(Scanner teclado) { 
        String novoCodigo = teclado.nextLine();
        if (novoCodigo != null && !novoCodigo.isEmpty()) {
            this.nome = novoCodigo;
        } else {
            System.out.println("nome inválido");
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