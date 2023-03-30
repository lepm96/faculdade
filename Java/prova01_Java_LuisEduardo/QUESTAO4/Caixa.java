public class Caixa {

    private int caixa;
    private   int deposito;
    private   int sacar;


    public int getCaixa() {
        return this.caixa;
    }

    public void setCaixa() {
        this.caixa = caixa;
    }

    
    
    public int getDepositar() {
        return deposito;
    }

    public void setDepositar(int deposito) {
        this.deposito = deposito;
    }

    
    public int getSacar() {
        return sacar;
    }

    public void setSacar(int sacar) {
        this.sacar = sacar;
    }

    public int depositarNoCaixa(int a, int b){
        return caixa = a + b;
    }

    public int sacarNoCaixa(int a, int b){
        return caixa = b - a;
    }

}
