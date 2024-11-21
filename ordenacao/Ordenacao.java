package ordenacao;
public class Ordenacao {

    // Método de ordenação por Bolha 
    public static void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação por Seleção 
    public static void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }
    }

    // Método de ordenação por Inserção 
    public static void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    // Método de ordenação por QuickSort
    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(vetor, inicio, fim);
            quicksort(vetor, inicio, pivo - 1);  // Ordena a parte esquerda
            quicksort(vetor, pivo + 1, fim);    // Ordena a parte direita
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    // Método de ordenação por MergeSort
    public static void mergesort(int[] vetor) {
        if (vetor.length < 2) {
            return; 
        }
        int meio = vetor.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[vetor.length - meio];

        System.arraycopy(vetor, 0, esquerda, 0, meio);
        System.arraycopy(vetor, meio, direita, 0, vetor.length - meio);

        mergesort(esquerda);  // Ordena a metade esquerda
        mergesort(direita);   // Ordena a metade direita

        merge(vetor, esquerda, direita);  // Junta as metades ordenadas
    }

    // Método para juntar as duas metades ordenadas no MergeSort
    private static void merge(int[] vetor, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }

        // Copiar os elementos restantes de esquerda, se houver
        while (i < esquerda.length) {
            vetor[k++] = esquerda[i++];
        }

        // Copiar os elementos restantes de direita, se houver
        while (j < direita.length) {
            vetor[k++] = direita[j++];
        }
    }

    // Método para exibir o vetor ordenado
    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
