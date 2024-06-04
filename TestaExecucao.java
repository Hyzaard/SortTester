import java.util.Arrays;

public class TestaExecucao {

    public static void rodaTeste(int[] vetor, String tipoVetor, String ordemVetor, String algoritmo) {

        int[] copiaVetor = Arrays.copyOf(vetor, vetor.length);
        MetricaDeOrdenacao metrica = new MetricaDeOrdenacao();

        switch (algoritmo) {
            case "bubbleSort":
                OrdenaAlgoritmo.bubbleSort(copiaVetor, metrica);
                break;
            case "selectionSort":
                OrdenaAlgoritmo.selectionSort(copiaVetor, metrica);
                break;
            case "insertionSort":
                OrdenaAlgoritmo.insertionSort(copiaVetor, metrica);
                break;
            case "quickSort":
                OrdenaAlgoritmo.quickSort(copiaVetor, metrica);
                break;
            case "mergeSort":
                OrdenaAlgoritmo.mergeSort(copiaVetor, metrica);
                break;
            default:
                System.out.println("Algoritmo não reconhecido.");
                return;
        }

        System.out.printf("Algoritmo: %s | Tamanho do vetor: %d | Tipo: %s (%s)%n",
                algoritmo, vetor.length, tipoVetor, ordemVetor);
        System.out.printf("Tempo: %.2f ms | Trocas: %f | Comparações: %f%n%n",
                metrica.getTempo(), metrica.getTrocas(), metrica.getComparacoes());
    }
}

