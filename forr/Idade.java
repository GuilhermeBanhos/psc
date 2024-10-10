package forr;
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        int Idade,Pessoas=0, IdadeTotal=0;
        double Media;
        Scanner input= new Scanner(System.in);
        System.out.println("Informe a Idade. Para parar o programa coloque idade negativa: ");
        for(;;){
            Idade= input.nextInt();

            if (Idade<0){
            break;}

            Pessoas++;
            IdadeTotal=IdadeTotal+Idade;

            if (Pessoas>0){
            System.out.println("A media das idades é " + (Media= (IdadeTotal/Pessoas)) + "anos" );}
            else
            System.out.println("Idade = 0 Divisão invalida");
    }
}
}