public class Empresa {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe", 50.0);
        Eletronico eletronico = new Eletronico("Notebook Dell", 4000.0);
        Roupa roupa = new Roupa("Camiseta Polo", 80.0);

        System.out.println(livro.getTipo() + ": " + livro.getNome() + " - Preço sem desconto: R$" + livro.getPreco() + " - Preço com desconto: R$" + livro.getPrecoComDesconto());
        System.out.println(eletronico.getTipo() + ": " + eletronico.getNome() + " - Preço sem desconto: R$" + eletronico.getPreco() + " - Preço com desconto: R$" + eletronico.getPrecoComDesconto());
        System.out.println(roupa.getTipo() + ": " + roupa.getNome() + " - Preço sem desconto: R$" + roupa.getPreco() + " - Preço com desconto: R$" + roupa.getPrecoComDesconto());
    }
}