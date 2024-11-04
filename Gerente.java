public class Gerente extends FuncionarioBase implements Beneficios{

    // Atributo
    private double bonusPercentual;

    // Construtor
    public Gerente(String nome, double salarioBase, double bonusPercentual){
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    // Getter e setter
    public double getBonusPercentual(){
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual){
        this.bonusPercentual = bonusPercentual;
    }

    // Método
    @Override
    public double calcularSalario(){
        return this.salarioBase + (this.bonusPercentual / 100 * this.salarioBase);
    }
    
    // Benefícios 
    @Override
    public double calcularBonus(double percentual){
        return calcularSalario() + (percentual / 100 * calcularSalario());
    }
    
    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return calcularSalario() + valorFixado;
    }

    // Exibir informação funcionário
    public String toString(){
        return "Gerente: " + nome + ", salario: " + calcularSalario();
    }

}
