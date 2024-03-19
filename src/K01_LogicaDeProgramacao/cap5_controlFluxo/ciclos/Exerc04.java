package K01_LogicaDeProgramacao.cap5_controlFluxo.ciclos;

import java.util.Scanner;

public class Exerc04 {
    // tabuada: 1x1 = 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero qualquer: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d X %d = %d\n",i ,num ,i*num);
        }
        input.close();
    }
}
