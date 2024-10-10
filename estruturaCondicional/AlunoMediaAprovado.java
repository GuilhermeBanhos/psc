package estruturaCondicional;
import java.util.Scanner;
public class AlunoMediaAprovado {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Nota1,Nota2,Nota3,Resultado;
        System.out.println("Digite os resultdos");
        Nota1= input.nextDouble();
        Nota2= input.nextDouble();
        Nota3= input.nextDouble();
        Resultado = (Nota1+Nota2+Nota3)/3;
        if (Resultado>= 0 && Resultado<3){
System.out.println("reprovado");
    }
    else if  ((Resultado>=3) && Resultado<=7) {
System.out.println("exame");
    }
    else if ((Resultado>7) && (Resultado<10)) {
    System.err.println("aprovado");
}
    }
 }
    

