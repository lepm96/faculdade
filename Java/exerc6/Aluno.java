public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setCidade(String cidade) {
        super.setCidade(cidade);
    }

    @Override
    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double media(){
        return (nota1 + nota2) / 2;
    }

    public void exibirInfAluno(){
        System.out.println("Nome:" + getNome() +
                "\nCidade: " + getCidade() +
                "\nMatrícula: " + getMatricula() +
                "\nMédia: " + media());
    }
}
