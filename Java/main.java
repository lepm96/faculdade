import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Matematica m1 = new Matematica();
        int escolha;

        do {
            System.out.println(
                    "\nEscolha a opção desejada:\n1) Soma\n2) Subtração\n3) Multiplicação\n4) Divisão \n5) Sair");
            escolha = entrada.nextInt();

            if (escolha == 1) {
                System.out.println("---SOMA---");

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o primeiro número: ");
                int n2 = entrada.nextInt();
                System.out.print(n1 + " + " + n2 + " = " + m1.adicao(n1, n2));

            } else if (escolha == 2) {
                System.out.println("---SUBTRAÇÃO---");

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o primeiro número: ");
                int n2 = entrada.nextInt();
                System.out.print(n1 + " + " + n2 + " = " + m1.subtracao(n1, n2));

            } else if (escolha == 3) {
                System.out.println("---DIVISÃO---");

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o primeiro número: ");
                int n2 = entrada.nextInt();
                System.out.print(n1 + " + " + n2 + " = " + m1.divisao(n1, n2));

            } else if (escolha == 4) {
                System.out.println("---MULTIPLICAÇÃO---");

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o primeiro número: ");
                int n2 = entrada.nextInt();
                System.out.print(n1 + " + " + n2 + " = " + m1.multiplicacao(n1, n2) + "\n");
            }

        } while (escolha != 5);

        entrada.close();
    }
}
