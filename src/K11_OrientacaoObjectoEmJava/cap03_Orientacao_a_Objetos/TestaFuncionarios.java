package K11_OrientacaoObjectoEmJava.cap03_Orientacao_a_Objetos;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Edvaldo Costa";
        funcionario.salarioDosFuncionarios = 2332.32;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Da Costa";
        funcionario2.salarioDosFuncionarios = 32343.34;

        System.out.printf("\nDados Do Primeiro Funcionario: \n");
        System.out.println("Nome do Primeiro Funcionario: " + funcionario.nome);
        System.out.println("Salário do Primeiro Funcionario: " + funcionario.salarioDosFuncionarios);

        System.out.println("\n--------------------------------\n");

        System.out.println("Dados Do Segundo Funcionario: ");
        System.out.println("Nome do Segundo Funcionario: " + funcionario2.nome);
        System.out.println("Salário do Segundo Funcionario: " + funcionario2.salarioDosFuncionarios);
    }
}
