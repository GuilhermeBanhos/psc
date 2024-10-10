package estruturaCondicional;
import java.util.Scanner;
public class Apartamento {
    public static void main(String[]args){
        int OpcaoApto, Dias;
        double ToatalPagar;
        Scanner input= new Scanner(System.in);
        System.out.println("Selecione a opção de apartamento em que o cliente foi hospedado:");
        System.out.println("Opção= 1 Apartamento simples");
        System.out.println("opção= 2 Apartamnto duplo");
        OpcaoApto= input.nextInt();
        System.out.println("informe o número de dias que o cliente fico hospedado");
        Dias= input.nextInt();

        if (OpcaoApto==1 && (Dias>0 && Dias<10 ))
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*100.00));
        else if (OpcaoApto==1 && (Dias>=10 && Dias<=15))
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*90.00));
        else if (OpcaoApto==1 && Dias>15)
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*80.00));

        else if (OpcaoApto==2 && (Dias>0 && Dias<10 ))
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*1400.00));
        else if (OpcaoApto==2 && (Dias>=10 && Dias<=15))
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*120.00));
        else 
        System.out.println("O total a pagar é R$:" + (ToatalPagar = Dias*100.00));


    }
}
