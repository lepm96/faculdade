import java.util.Scanner;

// QUESTAO NÚMERO 3

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Aluno a = new Aluno();
    Professor p = new Professor();

    System.out.println("--MENU--" +
            "\n1)Professor" +
            "\n2)Aluno");
    int opcao = entrada.nextInt();

    switch(opcao) {
        case 1:
            System.out.println("--INFO PROFESSOR--" +
                    "\nDeseja visualizar as informações?" +
                    "\n1)Sim" +
                    "\n2)Não");
            int opcaoAluno = entrada.nextInt();

                if(opcaoAluno == 1){
                    System.out.println("Nome: " + p.getNome() +
                            "\nEspecialização: " + p.getEspecializacao());
                }else{
                    System.out.println("Finalizando programa!!");
                }
                break;

        case 2:
            System.out.println("--INFO ALUNO--" +
                    "\nDeseja visualizar as informações?" +
                    "\n1)Sim" +
                    "\n2)Não");
            int opcaoProfessor = entrada.nextInt();

                if(opcaoProfessor == 1){
                    System.out.println("Nome: " + a.getNome() +
                    "\nSenha: " + a.getSenha());
                }else{
                    System.out.println("Finalizando programa!!");
                }

            break;
        default:
            System.out.println("Opção Inválida!!");
    }

    }
}
