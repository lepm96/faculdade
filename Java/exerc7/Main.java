public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Claudia", 29, 10000);
        Aluno a = new Aluno("Eduardo", 25, "20222193040");


        System.out.println("-----PROFESSOR-----");
        System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade + "\nSalário: " + p.salario);

        System.out.println("\n");
        System.out.println("-----ALUNO-----");
        System.out.println("Nome: " + a.nome + "\nIdade: " + a.idade + "\nMatricula: " + a.matricula);
    }
}
