package estruturaSequencial;
import java.util.Scanner;
public class CotaçãoDolar {
    public static void main(String[] args) {
        double  Real, ValorDolar, ValorConvertido;
        Scanner input= new Scanner(System.in);
        System.out.println("Informe o seu saldo em dolar");
        ValorDolar=input.nextDouble();
        System.out.println("Informe o valor do real");
        Real= input.nextDouble();
        ValorConvertido= ValorDolar*Real;
    System.out.println("Io valor convertido de dolar para reais é de R$:" + ValorConvertido);
    }
}
