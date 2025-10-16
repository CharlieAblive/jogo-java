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

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nome inválido");
        }
    }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = nome;
        }
    }
    public void setQuant(int quant) {
        
    }
    public void setPrecoUnit(double precoUnit) {
        
    }





}

