public class DescontoEletronico implements Desconto{
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.95; // desconto de 5%
    }

}
