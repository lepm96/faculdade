public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
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

   public double media() {
       return (nota1 + nota2) / 2;
   }

    protected void mostrarDados2(){
        System.out.println("Seu nome: " + getNome() +
                "\nSua idade: " + getIdade() +
                "\nPrimeira nota: " + getNota1() +
                "\nSegunda nota: " + getNota2() +
                "\nSua média: " + media());

    };
}
