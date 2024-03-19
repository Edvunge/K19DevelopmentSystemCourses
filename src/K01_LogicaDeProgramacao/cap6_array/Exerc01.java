package K01_LogicaDeProgramacao.cap6_array;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int LEN = 10;
        int[] arr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            System.out.println("digite um valor: ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < LEN; i++) {
            System.out.printf(" %d ",arr[i]);
        }
        input.close();
    }
}
