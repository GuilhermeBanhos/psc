package Vetor;
import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) {
        int i,posicaoMaior=0,posicaoMenor=0, Maiornumero = Integer.MIN_VALUE, Menornumero = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        for(i = 0; i < vetor.length; i++) {
        
        System.out.println("Informe um número: ");
        vetor[i] = input.nextInt();
        if (vetor[i]>Maiornumero){
        Maiornumero= vetor[i] ;
        posicaoMaior= i;}

        else if( vetor[i]<Menornumero){
            Menornumero= vetor[i];
            posicaoMenor= i;}
        }

        System.out.println("Vetores informado:");
        for(i = 0; i < vetor.length; i++){
        System.out.printf("v[%d] = %2d\n", i, vetor[i]);}

        System.out.println("Posição do vetor com menor numero");
        System.out.printf("v[%d] = %2d\n", posicaoMenor, Menornumero);

        System.out.println("posição do vetor com o maior numero");
        System.out.printf("v[%d] = %2d\n", posicaoMaior, Maiornumero);
        }

        
        }

