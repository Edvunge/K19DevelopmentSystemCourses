package K11_OrientacaoObjectoEmJava.cap03_Orientacao_a_Objetos;

public class TestaConta {
    public static void main(String[] args) {
        // Criando um objeto
        Conta referencia = new Conta();

        referencia.saldo  = 1000.0;
        referencia.limite = 500.0;
        referencia.numero = 1;

        System.out.println("Saldo:  " + referencia.saldo);
        System.out.println("Limite: " + referencia.limite);
        System.out.println("Numero: " + referencia.numero);
    }
}
