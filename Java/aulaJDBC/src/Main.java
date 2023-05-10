import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conexao conectar = new Conexao();
        conectar.GeraConexao();


        PessoaDAO dao = new PessoaDAO();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();


        Pessoa person = new Pessoa();
        person.setNome(nome);
        person.setIdade(idade);

        PessoaDAO.adiciona(person);

        System.out.println("Pessoa adicionada com sucesso!!");





    }
}
