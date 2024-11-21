package ordenacao;
import ordenacao.Ordenacao;
import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int escolha;

        do {
            System.out.println("Informe 10 números para ordenar:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = input.nextInt();
            }
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1 - Ordenação por Bolha ");
            System.out.println("2 - Ordenação por Seleção ");
            System.out.println("3 - Ordenação por Inserção ");
            System.out.println("4 - Ordenação por QuickSort");
            System.out.println("5 - Ordenação por MergeSort");
            System.out.print("Escolha: ");
            escolha = input.nextInt();

            if (escolha == 1) {
                Ordenacao.bolha(vetor);
                System.out.println("Vetor ordenado pelo método Bolha:");
            } else if (escolha == 2) {
                Ordenacao.selecao(vetor);
                System.out.println("Vetor ordenado pelo método Seleção:");
            } else if (escolha == 3) {
                Ordenacao.insercao(vetor);
                System.out.println("Vetor ordenado pelo método Inserção:");
            } else if (escolha == 4) {
                Ordenacao.quicksort(vetor, 0, vetor.length - 1);
                System.out.println("Vetor ordenado pelo método QuickSort:");
            } else if (escolha == 5) {
                Ordenacao.mergesort(vetor);
                System.out.println("Vetor ordenado pelo método MergeSort:");
            } else {
                System.out.println("Opção inválida.");
                continue; 
            }
        
            Ordenacao.exibirVetor(vetor);

            System.out.print("\nDeseja ordenar outro vetor? (1 para sim, 0 para não): ");
            escolha =input.nextInt();

        } while (escolha == 1);

        input.close();
        System.out.println("Programa encerrado.");
    }
}

