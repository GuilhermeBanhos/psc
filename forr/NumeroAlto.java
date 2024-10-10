package forr;
import java.util.Scanner;
public class NumeroAlto {
    public static void main(String[] args) {
        int Numero,NumeroMaior=0,NumeroMenor=0;
        Scanner input= new Scanner(System.in);
        System.out.println("informe um numero");
        System.out.println("o programa aceita apenas 10 Numeros" );
for (int i=0;i<11;i++){
    Numero= input.nextInt();
        if (NumeroMaior<Numero){
        NumeroMaior= Numero;}

        else if(Numero<NumeroMenor){
        NumeroMenor=Numero;}

        System.out.println("Informe o proximo numero:");
}
System.out.println("Dos números informados " + NumeroMaior + " foi o maior número informado e " + NumeroMenor + " foi o menor número informado");
    }
}
