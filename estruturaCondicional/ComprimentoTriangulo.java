package estruturaCondicional;
import java.util.Scanner;
public class ComprimentoTriangulo {
    public static void main(String[] args) {
        double A,B,C;
        Scanner input=new Scanner(System.in);
        System.out.println("informe os lados do trinagulo");
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();
        if ((B-C <A) && (A< B +C))
        System.out.println("verdadeiro");
        else
        System.out.println("falso");

        if ((A-B<C) && (C< A+B)) {
            System.out.println("verdadeiro");
            
        } else {
            System.out.println("falso");
        }
        if ((A-C<B) && (B< A+C)){
        System.out.println("verdadeiro"); }
            else { 
                System.out.println("Falso");
            
        }
         


    }
    
}
