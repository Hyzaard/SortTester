import java.util.Scanner;

public class MenuEscolhaAlgoritmo {
    public static String escolherAlgoritmo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Quick Sort");
        System.out.println("5 - Merge Sort");
        System.out.print("Digite o número correspondente ao algoritmo: ");

        int escolha = scanner.nextInt();
        scanner.close();
        switch (escolha) {
            case 1:
                return "bubbleSort";
            case 2:
                return "selectionSort";
            case 3:
                return "insertionSort";
            case 4:
                return "quickSort";
            case 5:
                return "mergeSort";
            default:
                System.out.println("Escolha inválida. Usando Bubble Sort por padrão.");
                return "bubbleSort";
        }
    }
}

