package K01_LogicaDeProgramacao.cap5_controlFluxo;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaDoDia;

        System.out.print("digite as horas: ");
        horaDoDia = input.nextInt();

        if (horaDoDia >= 18 && horaDoDia <= 23) {
            System.out.print("Boa Noite");
        } else if (horaDoDia >= 0 && horaDoDia <= 11) {
            System.out.println("Bom Dia");
        } else {
            System.out.println("Boa Tarde");
        }
        input.close();
    }
}
