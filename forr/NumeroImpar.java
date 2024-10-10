package forr;
import java.util.Scanner;
public class NumeroImpar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Numero;
        System.out.println("infomre um número");
        Numero= input.nextInt();

        for (int i=1; i<=Numero; i++){
         if (i % 2 != 0) 
         System.out.println(i);
         
        }
        System.out.println("estes são os números impares de 1 a " + Numero);

    }
}
