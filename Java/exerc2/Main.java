package exerc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Nome do produto que deseja cadastrar: ");
        p.nome = entrada.nextLine();

        System.out.print("Quantidade: ");
        int quantidade1 = entrada.nextInt();

        System.out.println("Produto cadastrado com sucesso!");

        System.out.println("Deseja realizar uma venda? \n1)Sim" +
        "\n2)Não");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quantidade que deseja vender: Produto -> " + p.nome);
                int quantidade2 = entrada.nextInt();
                int qtDAtual = p.decrementoEstoque(quantidade1, quantidade2);
                System.out.println("O estoque atual é: " + qtDAtual);
                break;
            case 2:
                p.mensagemCase2();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }







        entrada.close();
    }
}
