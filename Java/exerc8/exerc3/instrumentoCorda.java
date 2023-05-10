public class instrumentoCorda extends InstrumentoMusical implements TrocarCorda {
    private boolean precisaTrocarCorda;

    public instrumentoCorda(String nome, String material, int quantidade) {
        super(nome, material, quantidade);
        this.precisaTrocarCorda = false;
    }

    public boolean isPrecisaTrocarCorda() {
        return precisaTrocarCorda;
    }

    public void setPrecisaTrocarCorda(boolean precisaTrocarCorda) {
        this.precisaTrocarCorda = precisaTrocarCorda;
    }

    @Override
    public void trocarCorda() {
        System.out.println("Trocando a corda do " + getNome() + " de " + getMaterial());
        setPrecisaTrocarCorda(false);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o " + getNome() + " de " + getMaterial());
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o " + getNome() + " de " + getMaterial());
    }

    @Override
    public String toString() {
        return super.toString() + " - Precisa trocar corda: " + precisaTrocarCorda;
    }
}
