package Vetor;
import java.util.Scanner;
public class VetorIgual {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        int [] vetor1 = new int [10];
        int [] vetor2= new int [10];
        int i;
        System.out.println("Informe os valores do primeiro vetor");
        for(i = 0; i < vetor1.length; i++) {
            System.out.println("Informe um numero:");
            vetor1[i]= input.nextInt() ;}

            for(i = 0; i < vetor2.length; i++) {
            System.out.println("informe os valores do segundo vetor");
            vetor2[i]= input.nextInt();}

            int [] vetorSoma = new int [10];
            for (i= 0; i <vetorSoma.length; i++){
                vetorSoma[i]= vetor1[i] + vetor2[i];
            }
System.out.println("valores do vetor 1");

            for(i = 0; i < vetor1.length; i++) {
                System.out.printf("v1[%d] = %d\n", i ,vetor1[i]);}

System.out.println("valores do vetor 2");

                for(i = 0; i < vetor2.length; i++) {
                    System.out.printf("v2[%d] = %d\n", i ,vetor2[i]);}

System.out.println("a saoma de cada vetor:");

                    for(i = 0; i < vetorSoma.length; i++) {
                        System.out.printf("vS[%d] = %d\n", i ,vetorSoma[i]);}



        
}
}