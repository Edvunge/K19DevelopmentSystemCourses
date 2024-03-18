package K01_LogicaDeProgramacao.cap5_controlFluxo.ciclos;

public class Exerc03 {
    public static void main(String[] args) {
        // Escreva uma programa que imprime na tela os numeros de 1 a 100 exceto os numeros multiplos de 3
        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0) {
                System.out.printf(" %d ",i);
            }
        }
    }
}
