package animais;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double pesoKg;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    public Animal() {
        nome = "não definido";
        especie = "não definido";
        idade = 0;
        pesoKg = 0.0;

    }

    public Animal(String nome, String especie, int idade, Double pesoKg) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.pesoKg = pesoKg;
    }

    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public int getIdade() {
        return idade;
    }
    public double getPesoKg() {
        return pesoKg;
    } 
    public void setNome(Scanner teclado) { 
        String novoNome = teclado2.nextLine();
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido");
        }
    }
    public void setEspecie(Scanner teclado) { 
        String novoEspecie = teclado2.nextLine();
        if (novoEspecie != null && !novoEspecie.isEmpty()) {
            this.especie = novoEspecie;
        } else {
            System.out.println("Especie inválida");
        }
    }

    public void setIdade(Scanner teclado) {
        int novaIdade = teclado.nextInt();
        if (novaIdade >= 0) { 
            this.idade = novaIdade;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void setPesoKg(Scanner teclado) {
        Double novoPesoKg = teclado.nextDouble();
        if (novoPesoKg >= 0) { 
            this.pesoKg = novoPesoKg;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void calcularIdadeAnosHumanos() {
        int humanoIdade = idade * 7;
        System.out.println("A idade do(a) " + nome + " é " + humanoIdade);
    }

    public void atualizarPeso(Scanner teclado) {
        System.out.println("Informe o novo peso");
        Double novoPesoKg = teclado.nextDouble();
        if (novoPesoKg >= 0) { 
            this.pesoKg = novoPesoKg;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void classificarPorte() {
        String porte = "não definido";
        if (pesoKg <= 10) {
            porte = "Pequeno";
        } else if (pesoKg >= 10 && pesoKg<= 25) {
            porte = "Médio";
        } else if (pesoKg > 25){
            porte = "Grande";
        } else {
            System.out.println("Erro");
        }
        System.out.println("O porte do animal é " + porte);
    }
}

