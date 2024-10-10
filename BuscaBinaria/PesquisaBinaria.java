package BuscaBinaria;
import java.util.Scanner;

public class PesquisaBinaria {

    public static int pesquisaBinaria(int[] vetor, int valor) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int comparacoes = 0;

        while (esquerda <= direita) {
            comparacoes++;
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == valor) {
                System.out.println("Comparações realizadas: " + comparacoes);
                return meio; 
            }
            if (vetor[meio] < valor) {
                esquerda = meio + 1;
            }
            if (vetor[meio] > valor) {
                direita = meio - 1;
            }
        }

        System.out.println("Comparações realizadas: " + comparacoes);
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    int num = scanner.nextInt();

                    if (i == 0 || num >= vetor[i - 1]) {
                        vetor[i] = num;
                        numeroValido = true;
                    } else {
                        System.out.println("Por favor, insira um número maior ou igual ao último número inserido.");
                    }
                } catch (Exception e) {
                    System.out.println("Por favor, insira um número inteiro.");
                    scanner.next(); 
                }
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o número que deseja pesquisar (ou -1 para sair): ");
            int valor = scanner.nextInt();

            if (valor == -1) {
                continuar = false;
            } else {
                int resultado = pesquisaBinaria(vetor, valor);
                if (resultado != -1) {
                    System.out.println("Número encontrado na posição: " + resultado);
                } else {
                    System.out.println("Número " + valor + " não encontrado.");
                }
            }
        }

        scanner.close();
    }
}
