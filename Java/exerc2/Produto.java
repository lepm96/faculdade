package exerc2;

public class Produto {
    int codigo;
    String nome;
    int quantidade;

    
    
    public int decrementoEstoque(int a, int b){
        return a - b;
    }

    public void mensagemCase2(){
        System.out.println("Encerrando programa...");
        System.out.println("Finalizado!");
    }
}
