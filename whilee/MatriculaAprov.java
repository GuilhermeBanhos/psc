package whilee;
import java.util.Scanner;
public class MatriculaAprov{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        int matricula=1;
        double A1 , A2 , A3, Media;
       System.out.println("Para encerrar o programa insira o número da matrícula negativa");
        while (matricula>0){
        System.out.println("informe sua matricula:");
        matricula = input.nextInt();
        System.out.println("informe suas notas :");
        System.out.println("Nota A1:");
        A1= input.nextDouble();
        System.out.println("Nota A2:");
        A2= input.nextDouble();
        System.out.println("Nota A3:");
        A3= input.nextDouble();

        Media= (A1 + A3 + A2)/3;

        if (Media>=70)
        System.out.println("Aprovado: " + Media);

        else if (Media>=60 && Media<70)
        System.out.println("Está em recuperação: " + Media);

        else 
        System.out.println("Reprovado: " + Media);

    }
    }
}