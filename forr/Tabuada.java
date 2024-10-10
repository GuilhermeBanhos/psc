package forr;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Numero, Resultado;
        System.err.println("informe um numero");
        Numero= input.nextInt();
        for (int i=1;i<=10;i++){
            Resultado= Numero*i;
            System.out.println(Numero + "X" + i + "=" + Resultado );
        }
    }
}
