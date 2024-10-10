package matriz;
import java.util.Scanner;
public class Soma2x2 {
public static void main (String[] args){
    Scanner input= new Scanner(System.in);
    int [][] matriz1= new int [2][2];
    int [][]  matriz2 = new int [2][2]; 
    int [][] matrizResult = new int [2][2];
    int a,b;
    System.out.println("iforme os valores da primeira matriz");
for (a=0; a <matriz1.length; a++){
    for (b=0; b<matriz1[a].length;b++){
        System.out.println("informe os numeros:");
        matriz1[a][b]= input.nextInt();}}
System.out.println("infrome a segunda matriz");
        for (a=0; a <matriz2.length; a++){
            for (b=0; b<matriz2[a].length;b++){
                System.out.println("informe os numeros:");
                matriz2[a][b]= input.nextInt();}}

for (a=0; a < matrizResult.length; a++){
   for (b=0; b<matrizResult[a].length; b++){
    matrizResult[a][b] = matriz1[a][b] + matriz2[a][b];}}

    System.out.println("A soma das matrizes:");

    for (a=0; a < matrizResult.length; a++){
        for (b=0; b<matrizResult[a].length; b++){
            System.out.printf("[%d][%d] = %d\n", a, b, matrizResult[a][b]);}}
}
    
}
