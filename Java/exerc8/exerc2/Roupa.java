public class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco, new DescontoRoupa());
    }

    @Override
    public String getTipo() {
        return "Roupa";
    }
}