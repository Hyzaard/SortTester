import java.util.Arrays;
import java.util.Random;

public class CriaVetor {

    private static final Random random = new Random();

    public static int[] criaVetorOrdenado(int tamanho) {

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        System.out.println(vetor);
        return vetor;
    }

    public static int[] criaVetorInverso(int tamanho) {

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - i - 1;
        }
        return vetor;
    }

    public static int[] criaVetorDesordenado(int tamanho) {

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho);
        }
        return vetor;
    }

}
