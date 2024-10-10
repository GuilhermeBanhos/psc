package Vetor;
import java.util.Scanner;
public class PosicaoPar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    int[] vetor= new int [10];   
    int i,ContPares=0;
    for(i = 0; i < vetor.length; i++) {
    
    System.out.println("Informe um número: ");
    vetor[i] = input.nextInt();
    ContPares++ ;
    }
    
ContPares= (vetor.length + 1)/2; 
    int [] NumerosPares = new int[ContPares];
    int i2=0;

    for(i=0; i<vetor.length; i= i+2){
        NumerosPares[i2] = vetor[i];
        i2++;
        }

    System.out.println("Vetores informado:");

    for(i = 0; i < vetor.length; i++){
    System.out.printf("v[%d] = %2d\n", i, vetor[i]);}
    
    System.out.println("Vetores de numero par");
    for(i = 0; i < NumerosPares.length; i++){
        System.out.printf("v[%d] = %2d\n", i*2, NumerosPares[i]);}

    }

    
    }

