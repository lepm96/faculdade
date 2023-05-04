public class Livro extends Produto {
    public Livro(String nome, double preco) {
        super(nome, preco, new DescontoLivro());
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}