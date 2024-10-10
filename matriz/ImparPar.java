package matriz;
import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [][] matriz = new int[5][5];
        int a,b;

        for(a=0; a< matriz.length; a++){

            for(b=0; b<matriz[a].length; b++){

                System.out.println("informe um numero");
                matriz[a][b]= input.nextInt();
            }
            System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
            for ( a = 0; a < 5; a++) {
                for ( b = 0; b < 5; b++) {
                    if (a % 2 == 0 && b % 2 != 0) { 
                        System.out.printf("[%d][%d] = %d\n", a, b, matriz[a][b]);
                    }
                }
            }

        }
    }
    
}
