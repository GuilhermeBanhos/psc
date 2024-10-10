package estruturaCondicional;
import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Dias;
        double Taxa;
        System.out.println("Quantos dias o cliente ficou hospedado no hotel?");
        Dias= input.nextInt();

        if (Dias<15){
            Taxa= Dias* 15.00;
        System.out.println("O total a ser pago será de R$:" + (500+Taxa));
        } else if (Dias==15){
            Taxa= Dias*10.00;
            System.out.println("O total a ser pago será de R$:" +  (500+Taxa));
        } else {
        Taxa= Dias*5.00;
        System.out.println("O total a ser pago será de R$:" + (500+Taxa));}
    }
}
