public class DescontoLivro implements Desconto{
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.9; // desconto de 10%
    }
}
