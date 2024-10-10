package forr;
import java.util.Scanner;
public class NumeroMaior {
    public static void main(String[] args) {
        int Numero=0,NumeroMaior=0,NumeroMenor=0;
        String NumeroS;
        Scanner input= new Scanner(System.in);
        System.out.println("informe um numero");
        System.out.println("Para parar o programa coloque F" );
for (;;){
    NumeroS= input.nextLine();
    if(NumeroS.matches("F") || NumeroS.matches("f")) {
    System.out.println("Programa encerrado");
    break;}
    
    else
        Numero= Integer.parseInt(NumeroS);
        
        if (NumeroMaior<Numero){
        NumeroMaior= Numero;}
        else if(Numero<NumeroMenor){
        NumeroMenor=Numero;}
        System.out.println("Informe um número:");
}
System.out.println("Dos números informados " + NumeroMaior + " foi o maior número informado e " + NumeroMenor + " foi o menor número informado");
    }
}
