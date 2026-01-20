package K11_OrientacaoObjectoEmJava.cap03_Orientacao_a_Objetos;

public class TestaDeConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo  = 1000.0;
        c1.limite = 500.0;
        c1.numero = 1234;

        Conta c2 = new Conta();
        c2.saldo  = 2000.0;
        c2.limite = 250.0;
        c2.numero = 5678;

        System.out.println("Dados da primeira conta");
        System.out.println("Saldo:  " + c1.saldo);
        System.out.println("Limite: " + c1.limite);
        System.out.println("Numero: " + c1.numero);

        System.out.println("-----------------------");

        System.out.println("Dados da segunda conta");
        System.out.println("Saldo:  " + c2.saldo);
        System.out.println("Limite: " + c2.limite);
        System.out.println("Numero: " + c2.numero);
    }
}
