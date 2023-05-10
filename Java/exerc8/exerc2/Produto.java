public abstract class Produto {
    private String nome;
    private double preco;
    private Desconto desconto;

    public Produto(String nome, double preco, Desconto desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoComDesconto() {
        return desconto.calcularDesconto(preco);
    }

    public abstract String getTipo();
}
