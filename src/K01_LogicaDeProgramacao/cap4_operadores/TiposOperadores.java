package K01_LogicaDeProgramacao.cap4_operadores;

public class TiposOperadores {

    public static void main(String[] args) {
        // atribuicao
        int val = 3;
        val += 2;
        val -= 1;
        val *= 6;
        val /= 3;
        val %= 3;



        // operadores realcionais
        int value = 2;
        boolean t = false;
        t = (value == 2);
        t = (value != 2);
        t = (value <  2);
        t = (value <= 2);
        t = (value >= 2);


        //============ Op.logica

        // "E" logico &&
        // "OU" LOGICO ||

        int valor = 30;
        boolean teste = false;
        teste = valor < 40 && valor  > 20;
        teste = valor < 40 && valor  > 30;
        teste = valor < 30 || valor  > 20;
        teste = valor < 30 || valor  < 20;
        teste = valor < 50 && valor == 20;
    }
}
