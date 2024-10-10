package estruturaSequencial;
import java.util.Scanner;
public class TresNotas {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    double Nota1, Nota2, Nota3, Media;
         System.out.println("Informe suas notas");
        Nota1= input.nextDouble();
        Nota2= input.nextDouble();
        Nota3= input.nextDouble();
System.out.println("sua média é : " + (Media=(Nota1+Nota2+Nota3)/3));


    }
    
}
