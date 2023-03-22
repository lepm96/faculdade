import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Professor p = new Professor();
        Aluno a = new Aluno();

        System.out.println("""
                Qual cadastro deseja fazer?\s
                1)Professor
                2)Aluno""");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Qual seu nome: ");
                p.setNome(entrada.next());
                System.out.print("Qual sua idade: ");
                p.setIdade(entrada.nextInt());
                System.out.print("Qual sua especialização: ");
                p.setEspecializacao(entrada.next());
                System.out.print("Qual seu salário: ");
                p.setSalario(entrada.nextDouble());

                System.out.println("------CADASTRO REALIZADO COM SUCESSO!!------");

                    System.out.println("Deseja mostrar seus dados? " +
                            "\n1)Sim" +
                            "\n2)Não");

                    int opcaoMostrar = entrada.nextInt();

                    if(opcaoMostrar == 1) {
                        p.mostrarDados();
                    } else {
                        System.out.println("Programa Finalizado!");
                    }

             break;

            case 2:
                System.out.print("Qual seu nome: ");
                a.setNome(entrada.next());
                System.out.print("Qual sua idade: ");
                a.setIdade(entrada.nextInt());
                System.out.print("Primeira nota: ");
                a.setNota1(entrada.nextDouble());
                System.out.print("Segunda nota: ");
                a.setNota2(entrada.nextDouble());

                System.out.println("Deseja mostrar seus dados? " +
                        "\n1)Sim" +
                        "\n2)Não");

                int opcaoMostrar2 = entrada.nextInt();

                if(opcaoMostrar2 == 1) {
                    a.mostrarDados2();
                } else {
                    System.out.println("Programa Finalizado!");
                }

                break;
            default:
                System.out.print("Opção Inválida");
                break;
        }


        entrada.close();
    }
}
