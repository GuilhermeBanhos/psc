package estruturaCondicional;
import java.util.Scanner;
public class TipoTriangulo {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double LadoA,LadoB,LadoC;
        System.out.println("Informe os lados do triângulo:");

        System.out.println("Lado A:");
        LadoA= input.nextDouble();
        System.out.println("Lado B:");
        LadoB= input.nextDouble();
        System.out.println("Lado C:");
        LadoC= input.nextDouble();

if (LadoA==LadoB && LadoB==LadoC){
System.out.println("triângulo equilatero");
System.out.println("todos os lados iguais");}

else if (LadoA==LadoB || LadoA==LadoC || LadoB == LadoC){
System.out.println("Triângulo Isóceles");}

else{
System.out.println("Triângulo escaleno");}
 } 
    }