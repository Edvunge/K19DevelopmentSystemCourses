package K01_LogicaDeProgramacao.cap5_controlFluxo.estrCondicional;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoDoProduto1, precoDoProduto2;

        System.out.print("digite o valor do produto 1:");
        precoDoProduto1 = input.nextDouble();

        System.out.print("digite o valor do produto 2:");
        precoDoProduto2 = input.nextDouble();

        if (precoDoProduto1 > precoDoProduto2) {
            System.out.println("O produto 1 mais caro.");
        } else {
            System.out.println("O produto 2 mais caro.");
        }
        input.close();
    }
}
