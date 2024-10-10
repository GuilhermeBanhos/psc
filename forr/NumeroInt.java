package forr;
import java.util.Scanner;
public class NumeroInt {
    public static void main (String[]args){
    
        Scanner input= new Scanner(System.in);
        int Numero,Numero2;
        System.out.println("Informe dois números:");
        Numero= input.nextInt();
        Numero2= input.nextInt();
         for (int i= Numero; i<= Numero2;i++)
         System.out.println(i);
    }
}
