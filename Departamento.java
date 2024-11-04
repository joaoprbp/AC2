import java.util.ArrayList;

public class Departamento {
    
    private String nome;
    ArrayList<FuncionarioBase> funcionarios;

    // Construtor
    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    // Getter e setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // Adionar funcionário
    public void adicionarFuncionario(FuncionarioBase funcionarios){
        this.funcionarios.add(funcionarios);
    }

    // Remover funcionário
    public void removerFuncionario(FuncionarioBase funcionarios){
        this.funcionarios.remove(funcionarios);
    }

    // Calcular folha de pagamento
    public double calcularFolhaPagamento(){
        double somaTotal = 0;
        for(int i = 0; i < funcionarios.size(); i++){
            FuncionarioBase funcionario = funcionarios.get(i);
            somaTotal += funcionario.calcularSalario();
        }
        return somaTotal;
    }

    // Imprimir nome dos funcionários e o salário 
    public void imprimirSalariosFuncionarios(){
        for(int i = 0; i < funcionarios.size(); i++){
            FuncionarioBase funcionario = funcionarios.get(i);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: R$" + funcionario.calcularSalario());
            System.out.println();
        }
    }

    public String toString(){
        return "Folha de pagamento do departamento: " + calcularFolhaPagamento();
    }
    
}
