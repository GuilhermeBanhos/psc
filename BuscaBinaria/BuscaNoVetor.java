package BuscaBinaria;
import java.util.Scanner;

public class BuscaNoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        // Leitura dos 10 números
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Executar buscas
        realizarBuscas(vetor, scanner);
        
        scanner.close();
    }

    public static void realizarBuscas(int[] vetor, Scanner scanner) {
        // Loop para permitir múltiplas buscas
        for (int i = 0; i < 3; i++) {  // Limite de 3 buscas, por exemplo
            System.out.println("\nEscolha o método de busca:");
            System.out.println("1. Busca Sequencial");
            System.out.println("2. Busca Sequencial com Sentinela");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                break; 
            }

            System.out.print("Digite o número a ser pesquisado: ");
            int numero = scanner.nextInt();
            int comparacoes = 0;

            if (opcao == 1) {
                comparacoes = buscaSequencial(vetor, numero);
            } else if (opcao == 2) {
                comparacoes = buscaSequencialComSentinela(vetor, numero);
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.println("Número " + (comparacoes > 0 ? "encontrado" : "não encontrado") + 
                               " com " + comparacoes + " comparações.");
        }
    }

    public static int buscaSequencial(int[] vetor, int numero) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numero) {
                return comparacoes; 
            }
        }
        return -1; 
    }

    public static int buscaSequencialComSentinela(int[] vetor, int numero) {
        int comparacoes = 0;
        int n = vetor.length;
        int ultimo = vetor[n - 1]; 
        vetor[n - 1] = numero; 

        int i = 0;
        while (vetor[i] != numero) {
            comparacoes++;
            i++;
        }

        
        vetor[n - 1] = ultimo;

        
        return (i < n - 1) ? comparacoes : -1; // Retorna -1 se não encontrado
    }
}
