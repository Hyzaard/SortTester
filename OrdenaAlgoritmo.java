public class OrdenaAlgoritmo {

    public static void bubbleSort(int[] vetor, MetricaDeOrdenacao metrica) {

        double tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                metrica.addComparacoes();
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    metrica.addTroca();
                }
            }
        }

        double tempoFinal = System.currentTimeMillis();
        metrica.setTempo(tempoFinal - tempoInicio);
    }

}
