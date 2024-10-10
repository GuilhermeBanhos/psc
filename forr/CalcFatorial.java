package forr;
import java.util.Scanner;
public class CalcFatorial {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int Numero,Fatorial=1;
        System.out.println("Informe o numero a ser fatorado:");
        Numero= input.nextInt();
        if(Numero==0){
        System.out.println("0!=1");
        return;}
         if(Numero<0){
        System.out.println("Numero inválido. O numero não pode ser negativo");
        return;}
        for(int i =Numero; i>=1;i-- ){
            Fatorial= Fatorial*i;
            
        }
        System.out.println(Numero+ "! = " + Fatorial);
    }
}
