import java.util.Arrays;
import java.util.Scanner;

public class TestaOrdenacao {
    
    private static final int[] SIZES = {100, 1000, 10000, 100000, 1000000};

    public static void main(String[] args) {

        String algoritmo = MenuEscolhaAlgoritmo.escolherAlgoritmo();

            for (int size : SIZES) {
                int[] vetorOrdenado = CriaVetor.criaVetorOrdenado(size);
                int[] vetorInversamenteOrdenado = CriaVetor.criaVetorInverso(size);
                int[] vetorDesordenado = CriaVetor.criaVetorDesordenado(size);

                TestaExecucao.rodaTeste(vetorOrdenado, "ordenado", "crescente", "quickSort");
                TestaExecucao.rodaTeste(vetorInversamenteOrdenado, "ordenado", "decrescente", "quickSort");
                TestaExecucao.rodaTeste(vetorDesordenado, "desordenado", "aleatório", "quickSort");
            }
        }

}

