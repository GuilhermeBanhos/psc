package Vetor;
import java.util.Scanner;
public class Soma {
        public static void main(String[] args) {
        
        int i,Soma=0;
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        for(i = 0; i < vetor.length; i++) {
        
        System.out.println("Informe um número: ");
        vetor[i] = input.nextInt();
        if (vetor[i] %2 ==0)
        Soma =Soma+ vetor[i];
        }
        System.out.println("Vetor informado:");
        for(i = 0; i < vetor.length; i++){
        System.out.printf("v[%d] = %2d\n", i, vetor[i]);}
        System.out.println("A soma dos numeros pares é " + Soma);
        
        }

        
        }
    

