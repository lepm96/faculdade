import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Caixa c = new Caixa();


        int opcao;

        do {

            System.out.println("--O QUE DESEJA--" +
                    "\n1)Depositar" +
                    "\n2)Sacar" +
                    "\n3)Sair");
            opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Valor do deposito: ");
                int quantidadeDeposito = entrada.nextInt();
                c.depositarNoCaixa(quantidadeDeposito, c.getCaixa());
               System.out.println("SALDO ATUAL -> " + c.getCaixa());
                break;


            case 2:
                System.out.println("Valor do saque: ");
                int quantidadeSaque = entrada.nextInt();

                c.sacarNoCaixa(quantidadeSaque,c.getCaixa());

                    if(quantidadeSaque > c.getCaixa()) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("SALDO ATUAL -> " + c.getCaixa());
                        System.out.println("Saldo retirado");
                    }
                break;

            case 3:
                System.out.println("Finalizando...");

            } } while(opcao != 3);
        }
    }

