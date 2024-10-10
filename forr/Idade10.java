package forr;
import java.util.Scanner;
public class Idade10 {
    public static void main(String[] args) {
        int Idade,IdadeTotal=0;
        double Media;
        Scanner input= new Scanner(System.in);
        System.out.println("Digite uma idade");
        System.out.println("Limite maximo de idades é 10");

        for(int i=0;i<11;i++){
            Idade=input.nextInt();
            if(Idade<0)
            System.out.println("Idade invalida");
            else{
                
                 IdadeTotal=IdadeTotal+ Idade;
                 System.out.println("Informe a proxima idade");
            }
        }
        System.out.println("A media das dez idades são : " + (Media=IdadeTotal/10));
    }
}
