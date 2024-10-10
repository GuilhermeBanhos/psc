package estruturaSequencial;
import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double Hipotenusa,CatetoOp,CatetoAd;
        System.out.println("informe o valor do cateto oposto");
        CatetoOp= input.nextDouble();
        System.out.println("informe o valor do cateto adjacente");
        CatetoAd= input.nextDouble();
Hipotenusa= (CatetoAd*CatetoAd) + (CatetoOp*CatetoOp);
double Raiz = Math.sqrt(Hipotenusa);
System.out.println("o lavor da hipotenusa é :" + Raiz);

    }
}