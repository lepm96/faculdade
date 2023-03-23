import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("---OLÁ, DIGITE SUAS INFORMAÇÕES ABAIXO---");
        System.out.println("Seu nome: ");
        a.setNome(entrada.next());
        System.out.println("Sua idade: ");
        a.setIdade(entrada.nextInt());
        System.out.println("Bairro: ");
        a.setEndereco(entrada.next());

        System.out.println("---OLÁ, " + a.getNome() + " DIGITE SUAS NOTAS---");
        System.out.println("1ª - Nota: ");
        a.setNota1(entrada.nextDouble());
        System.out.println("2ª - Nota: ");
        a.setNota2(entrada.nextDouble());
        System.out.println("3ª - Nota: ");
        a.setNota3(entrada.nextDouble());
        System.out.println("4ª - Nota: ");
        a.setNota4(entrada.nextDouble());

        a.exibirInfo();
        System.out.println("------------");
        if(a.media() > 7){
            System.out.println("APROVADOOO!!!");
        }else{
            System.out.println("REPROVADOOO!!!");
        }


        entrada.close();
    }
}
