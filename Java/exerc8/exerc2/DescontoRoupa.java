public class DescontoRoupa implements Desconto{
    @Override
    public double calcularDesconto(double preco) {
        return preco; // preço fixo para roupas
    }
}
