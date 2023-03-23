import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Professor p = new Professor();
        Aluno a = new Aluno();


        System.out.println(" O que deseja cadastrar?" +
                "\n1)Professor" +
                "\n2)Aluno" +
                "\n3)Sair");

        int opcao = entrada.nextInt();


        switch (opcao) {

            case 1:

                System.out.println("---PROFESSOR---");

                System.out.println("Seu nome: ");
                p.setNome(entrada.next());
                System.out.println("Sua cidade: ");
                p.setCidade(entrada.next());
                System.out.println("Sua matrícula: ");
                p.setMatricula(entrada.nextInt());
                System.out.println("Quantas horas diárias de trabalho: ");
                p.setHrsTrabalhadas(entrada.nextDouble());
                System.out.println("Qual valor da hora trabalhada: ");
                p.setValorHrAula(entrada.nextDouble());

                p.exibirInfProf();


                break;

            case 2:

                System.out.println("---ALUNO---");

                System.out.println("Seu nome: ");
                a.setNome(entrada.next());
                System.out.println("Sua cidade: ");
                a.setCidade(entrada.next());
                System.out.println("Sua matrícula: ");
                a.setMatricula(entrada.nextInt());
                System.out.println("1ª - Nota: ");
                a.setNota1(entrada.nextInt());
                System.out.println("2ª - Nota: ");
                a.setNota2(entrada.nextInt());

                a.exibirInfAluno();

                if(a.media() > 7){
                    System.out.println("Aprovado");
                }else {
                    System.out.println("Reprovado");
                }

                break;

            default:
                System.out.println("Opção Inválida");



        }


        entrada.close();
    }
}
