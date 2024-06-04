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

    public static void selectionSort(int[] vetor, MetricaDeOrdenacao metrica) {

        double tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                metrica.addComparacoes();
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
            metrica.addTroca();
        }

        double tempoFinal = System.currentTimeMillis();
        metrica.setTempo(tempoFinal - tempoInicio);
    }

    public static void insertionSort(int[] vetor, MetricaDeOrdenacao metrica) {

        double tempoInicio = System.currentTimeMillis();

        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                metrica.addComparacoes();
                vetor[j + 1] = vetor[j];
                j = j - 1;
                metrica.addTroca();
            }
            vetor[j + 1] = key;
        }

        double tempoFinal = System.currentTimeMillis();
        metrica.setTempo(tempoFinal - tempoInicio);
    }

    public static void quickSort(int[] vetor, MetricaDeOrdenacao metrica) {

        double tempoInicio = System.currentTimeMillis();
        quickSortRecursive(vetor, 0, vetor.length - 1, metrica);
        double tempoFinal = System.currentTimeMillis();
        metrica.setTempo(tempoFinal - tempoInicio);
    }

    private static void quickSortRecursive(int[] vetor, int low, int high, MetricaDeOrdenacao metrica) {

        if (low < high) {
            int pi = partition(vetor, low, high, metrica);
            quickSortRecursive(vetor, low, pi - 1, metrica);
            quickSortRecursive(vetor, pi + 1, high, metrica);
        }
    }

    private static int partition(int[] vetor, int low, int high, MetricaDeOrdenacao metrica) {

        int pivotIndex = medianOfThree(vetor, low, high);
        swap(vetor, pivotIndex, high);
        int pivot = vetor[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            metrica.addComparacoes();
            if (vetor[j] <= pivot) {
                i++;
                swap(vetor, i, j);
                metrica.addTroca();
            }
        }
        swap(vetor, i + 1, high);
        metrica.addTroca();
        return i + 1;
    }

    private static int medianOfThree(int[] vetor, int low, int high) {

        int mid = low + (high - low) / 2;
        if (vetor[low] > vetor[mid]) swap(vetor, low, mid);
        if (vetor[low] > vetor[high]) swap(vetor, low, high);
        if (vetor[mid] > vetor[high]) swap(vetor, mid, high);
        return mid;
    }

    private static void swap(int[] vetor, int i, int j) {

        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void mergeSort(int[] vetor, MetricaDeOrdenacao metrica) {

        double tempoInicio = System.currentTimeMillis();
        mergeSortRecursive(vetor, 0, vetor.length - 1, metrica);
        double tempoFinal = System.currentTimeMillis();
        metrica.setTempo(tempoFinal - tempoInicio);
    }

    private static void mergeSortRecursive(int[] vetor, int left, int right, MetricaDeOrdenacao metrica) {

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(vetor, left, mid, metrica);
            mergeSortRecursive(vetor, mid + 1, right, metrica);
            merge(vetor, left, mid, right, metrica);
        }
    }

    private static void merge(int[] vetor, int left, int mid, int right, MetricaDeOrdenacao metrica) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = vetor[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = vetor[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            metrica.addComparacoes();
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
            metrica.addTroca();
            k++;
        }

        while (i < n1) {
            vetor[k] = L[i];
            i++;
            k++;
            metrica.addTroca();
        }

        while (j < n2) {
            vetor[k] = R[j];
            j++;
            k++;
            metrica.addTroca();
        }
    }
}
