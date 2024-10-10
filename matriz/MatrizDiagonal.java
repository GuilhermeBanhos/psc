package matriz;
import java.util.Scanner;
public class MatrizDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Informe os elementos da matriz 5 x 5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("infrome um numero:");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i]; 
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
        System.out.println("\nMatriz resultante após a troca:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println(); 
        }

        input.close(); 
    }
    }

