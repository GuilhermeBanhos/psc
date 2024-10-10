package estruturaSequencial;
import java.util.Scanner;
public class Celsius{
    public static void main (String [] args){
        double Celsius, Fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura em celsius");
        Celsius= input.nextDouble();
        System.out.println("a temperatura em Fahrenheit é de °F " + (Fahrenheit= (Celsius*1.8)+38));
    }

}