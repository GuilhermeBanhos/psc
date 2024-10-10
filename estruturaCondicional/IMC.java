package estruturaCondicional;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Altura, Peso, IMC, Potencia;
        System.out.println("digite sua altura");
        Altura= input.nextDouble();
        System.out.println("Digite seu peso");
        Peso= input.nextDouble();
       Potencia = Math.pow(Altura,2);
        IMC= Peso/Potencia;
        if (IMC <=20)
        System.out.println("Abaixo do Peso");

        else if (IMC> 20 && IMC<= 25 )
        System.out.println("Normal");

        else if (IMC> 25 && IMC<=30 )
        System.out.println("Sobrepeso");

        else if (IMC>30 && IMC>=40)
        System.out.println("obesidade");
        else 
        System.out.println("Obesidade Morbida");

    }
    
}
