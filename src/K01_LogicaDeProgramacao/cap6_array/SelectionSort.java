package K01_LogicaDeProgramacao.cap6_array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[6];
        int auxiliar = 0;
        int indiceDoMenor = 0;

        for (int i = 0; i < array.length; i++) {
            indiceDoMenor = 1;

            for (int j = i * 1; j < array.length; j++) {
                if (array[j] < array[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }

            if (indiceDoMenor != i) {
                auxiliar = array[indiceDoMenor];
                array[indiceDoMenor] = array[i];
                array[i] = auxiliar;
            }
        }
    }
}
