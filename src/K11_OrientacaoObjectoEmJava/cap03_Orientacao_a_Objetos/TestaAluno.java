package K11_OrientacaoObjectoEmJava.cap03_Orientacao_a_Objetos;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.RG = 234443;
        aluno1.nome = "Edvaldo";
        aluno1.dataNascimento = 18061995;

        Aluno aluno2 = new Aluno();
        aluno2.RG = 2312221;
        aluno2.nome = "Costa";
        aluno2.dataNascimento = 12042005;

        System.out.printf("\nDados do Primeiro Aluno\n");
        System.out.println("Aluno1 Chama-se: " + aluno1.nome);
        System.out.println("RG Do Aluno: " + aluno1.RG);
        System.out.println("Data de nascimento: " + aluno1.dataNascimento);

        System.out.println("\n--------------------------\n");

        System.out.println("Dados do Segundo Aluno");
        System.out.println("Aluno2 Chama-se: " + aluno2.nome);
        System.out.println("RG Do Aluno: " + aluno2.RG);
        System.out.println("Data de nascimento: " + aluno2.dataNascimento);
    }
}
