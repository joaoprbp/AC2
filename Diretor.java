public class Diretor extends FuncionarioBase implements Beneficios{
    
    private double bonusPercentual;
    private double auxilioMoradia;

    // Construtor
    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia){
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    // Getter e setter
    public double getBonusPercentual(){
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual){
        this.bonusPercentual = bonusPercentual;
    }

    public double getAuxilioMoradia(){
        return auxilioMoradia;
    }

    public void setAuxilioMoradia(double auxilioMoradia){
        this.auxilioMoradia = auxilioMoradia;
    }

    // Método
    @Override
    public double calcularSalario(){
        return this.salarioBase + (this.bonusPercentual / 100 * this.salarioBase) + this.auxilioMoradia;
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
    
    // Exibir infomação do funcionário
    public String toString(){
        return "Diretor: " + nome + ", salario: " + calcularSalario();
    }
}
