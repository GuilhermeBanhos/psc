package Vetor;
import java.util.Scanner;
public class Negativo {
    public static void main(String[] args) {
        int i,ContNegativos=0;
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        for(i = 0; i < vetor.length; i++) {
        
        System.out.println("Informe um número: ");
        vetor[i] = input.nextInt();
        if (vetor[i]<0)
        ContNegativos++ ;
        }

        int [] NumerosNegativos = new int[ContNegativos];
        int i2=0;

        for(i=0; i<vetor.length; i++){
            if(vetor[i]<0){
            NumerosNegativos[i2] = vetor[i];
            i2++;
            }
        }
        System.out.println("Vetores informado:");

        for(i = 0; i < vetor.length; i++){
        System.out.printf("v[%d] = %2d\n", i, vetor[i]);}
        
        System.out.println("Vetores de valor negativo");
        for(i = 0; i < NumerosNegativos.length; i++){
            System.out.printf("v[%d] = %2d\n", i, NumerosNegativos[i]);}

        }

        
        }
    

    

