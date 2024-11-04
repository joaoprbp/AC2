public class Main{

    public static void main(String[] args) {
        
        Departamento departamento = new Departamento("Tecnologia");
        Funcionario func1 = new Funcionario("João", 3000.00);
        Gerente ger1 = new Gerente("Maria", 5000.00, 20.0);
        Diretor dir1 = new Diretor("Carlos", 10000.00, 30.0, 2000.0);

        // Exibir bonus adicional

        System.out.println("Bônus adicional gerente: " + ger1.calcularBonus(10));
        System.out.println("Auxilio moradia gerente: " + ger1.calcularAuxilioMoradia(400));
        System.out.println();
        System.out.println("Bônus adicional diretor: " + dir1.calcularBonus(10));
        System.out.println("Auxilio do diretor: " + dir1.calcularAuxilioMoradia(400));
        System.out.println();
        
        // Adicionando funcionários no departamento
        departamento.adicionarFuncionario(func1);
        departamento.adicionarFuncionario(ger1);
        departamento.adicionarFuncionario(dir1);
        
        // Folha de pagamento total
        System.out.println(departamento.toString());
        System.out.println();

        // Imprimir nome e salário dos funcionários
        departamento.imprimirSalariosFuncionarios();
        
    }

}