package estruturaSequencial;
import java.util.Scanner;
public class Raio {
    public static void main (String[] args){
        double Raio,Comprimento,Area,Volume1,Volume;
        Scanner input= new Scanner(System.in);
        System.out.println("Digite o raio");
        Raio=input.nextDouble();
        Comprimento= 2* 3.14* Raio;
        Area= 3.14* (Raio*Raio);
        Volume1= 0.75* 3.14 ;
        Volume= Volume1*(Raio*Raio*Raio);
        System.out.println("o comprimento da esfera é:" + Comprimento);
        System.out.println("A area da esfera é:"+ Area);
        System.out.println("O volume da esfera é:" + Volume);  
    }
}