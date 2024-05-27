import java.util.Arrays;

public class TestaExecucao {

    public void rodaTeste(int[] vetor, String tipoVetor) {

        int[] vetorCopia = Arrays.copyOf(vetor, vetor.length);

        System.out.println(tipoVetor);

        MetricaDeOrdenacao metrica = new MetricaDeOrdenacao();
        OrdenaAlgoritmo.bubbleSort(vetorCopia, metrica);
        System.out.println("Bubble Sort: " + metrica);

        System.out.println();
    }
}

