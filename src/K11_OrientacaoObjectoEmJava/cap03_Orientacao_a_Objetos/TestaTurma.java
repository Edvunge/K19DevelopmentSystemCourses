package K11_OrientacaoObjectoEmJava.cap03_Orientacao_a_Objetos;

public class TestaTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.periodo = "Manha";
        turma1.serie = "A";
        turma1.sigla = "AM1M";
        turma1.tipoDeEnsino = "Presencial";

        System.out.println(turma1.periodo);
        System.out.println(turma1.serie);
        System.out.println(turma1.sigla);
        System.out.println(turma1.tipoDeEnsino);

        System.out.printf("\n------------------\n");

        Turma turma2 = new Turma();
        turma2.periodo = "Tarde";
        turma2.serie = "B";
        turma2.sigla = "AM2T";
        turma2.tipoDeEnsino = "Presencial";

        System.out.println(turma2.periodo);
        System.out.println(turma2.serie);
        System.out.println(turma2.sigla);
        System.out.println(turma2.tipoDeEnsino);
    }
}
