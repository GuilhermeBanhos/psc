package forr;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int  Numero1, Numero2,Potencia1=1;
        System.out.println("Informe o numero:");
        Numero1= input.nextInt();
        System.out.println("informe o expoente");
        Numero2= input.nextInt();

        for (int i = 0; i<Numero2; i++){
            Potencia1= Potencia1*Numero1;
           
        }
        System.out.println(Numero1 + " elevado a " + Numero2 + " é " + Potencia1);
    }
    
}
