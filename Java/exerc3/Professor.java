public class Professor extends Pessoa{

    private String especializacao;
    private double salario;

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected void mostrarDados(){
        System.out.println("Seu nome: " + getNome() +
        "\nSua idade: " + getIdade() +
        "\nSua especialização: " + getEspecializacao() +
        "\nSeu salário: " + getSalario());
    }
}
