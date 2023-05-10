public abstract class InstrumentoMusical {
    private String nome;
    private String material;
    private int quantidade;

    public InstrumentoMusical(String nome, String material, int quantidade) {
        this.nome = nome;
        this.material = material;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void tocar();

    public abstract void afinar();

    @Override
    public String toString() {
        return nome + " de " + material + " - Quantidade: " + quantidade;
    }
}
