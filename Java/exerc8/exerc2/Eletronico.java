public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco, new DescontoEletronico());
    }

    @Override
    public String getTipo() {
        return "Eletrônico";
    }
}