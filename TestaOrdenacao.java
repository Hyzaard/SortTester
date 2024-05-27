public class TestaOrdenacao {

    private static final int[] TAMANHOS = {100, 1000, 10000, 100000, 1000000};

    public static void main(String[] args) {

        TestaExecucao testaExecucao = new TestaExecucao();

        for (int tamanho : TAMANHOS) {
            System.out.println("Tamanho do vetor: " + tamanho);

            int[] vetorOrdenado = CriaVetor.criaVetorOrdenado(tamanho);
            testaExecucao.rodaTeste(vetorOrdenado, "Vetor ordenado");

            int[] vetorInversamenteOrdenado = CriaVetor.criaVetorInverso(tamanho);
            testaExecucao.rodaTeste(vetorInversamenteOrdenado, "Vetor Inversamente Ordenado");

            int[] vetorDesordenado = CriaVetor.criaVetorDesordenado(tamanho);
            testaExecucao.rodaTeste(vetorDesordenado, "Vetor Desordenado");

            System.out.println();
        }
    }
}

