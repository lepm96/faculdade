public class Professor extends Pessoa {

    private double salario;
    private double hrsTrabalhadas;
    private double valorHrAula;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }

    public void setHrsTrabalhadas(double hrsTrabalhadas) {
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public double getValorHrAula() {
        return valorHrAula;
    }

    public void setValorHrAula(double valorHrAula) {
        this.valorHrAula = valorHrAula;
    }

    public double calcularSalario(){
       return salario = (getHrsTrabalhadas() * 21) * getValorHrAula();
    }

    public void exibirInfProf(){
        System.out.println("Nome:" + getNome() +
                "\nCidade: " + getCidade() +
                "\nMatrícula: " + getMatricula() +
                "\nSalário Mês: " + calcularSalario());
    }

}
