public class Funcionario extends FuncionarioBase {

    // Construtor
    public Funcionario(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    // Método
    @Override
    public double calcularSalario(){
        return this.salarioBase;
    }

    // Exibir infomação do funcionário
    public String toString(){
        return "Funcionario: " + nome + ", salario: " + calcularSalario();
    }

}
