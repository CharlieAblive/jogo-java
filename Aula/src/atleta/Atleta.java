package atleta;
import java.util.Scanner;

public class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoKg;
    private double alturaM;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

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
        String novoNome = teclado2.nextLine();
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido");
        }
    }
    public void setModalidade(Scanner teclado) { 
        String novaModal = teclado2.nextLine();
        if (novaModal != null && !novaModal.isEmpty()) {
            this.modalidade = novaModal;
        } else {
            System.out.println("Modalidade inválida");
        }
    }

    public void setIdade(Scanner teclado) {
        int novaIdade = teclado.nextInt();
        if (novaIdade >= 0) { 
            this.idade = idade + novaIdade;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void setPesoKg(Scanner teclado) {
        Double novoPeso = teclado.nextDouble();
        if (novoPeso >= 0) { 
            this.pesoKg = novoPeso;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void setAlturaM(Scanner teclado) {
        Double novaAltura = teclado.nextDouble();
        if (novaAltura >= 0) { 
            this.alturaM = novaAltura;
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public void calcularIMC() {
        double imc = pesoKg / alturaM * alturaM;
        System.out.println("O imc do atleta " + nome + "é de " + imc);
    }

    public void classificCate() {
        String categoria = "não definido";
        if (idade < 12) {
            System.out.println("Não está apto para competir.");
        } else if (idade == 12 || idade == 13){
            categoria = "Sub-14";
        } else if (idade == 14 || idade == 15){
            categoria = "Sub-16";
        } else if (idade >= 16 && idade <= 40){
            categoria = "Adulto";
        } else if (idade > 40){
            categoria = "Master";   
        } else {
            System.out.println("Erro");
        }
        System.out.println("A categoria do(a) atleta é " + categoria);
    }

}
