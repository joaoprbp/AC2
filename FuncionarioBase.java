public abstract class FuncionarioBase{

    // Atributos
    protected String nome;
    protected double salarioBase;

    // Construtor
    public FuncionarioBase(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double  salarioBase){
        this.salarioBase = salarioBase;
    }

    // Método
    public abstract double calcularSalario();

    public double calcularSalario(double bonusAdicional){
        return calcularSalario() + bonusAdicional;
    }

}