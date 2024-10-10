package estruturaCondicional;
import java.util.Scanner;
public class AlunoAprovado {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Nota1,Nota2,Resultado;
        System.out.println("Digite os resultdos");
        Nota1= input.nextDouble();
        Nota2= input.nextDouble();
        Resultado = (Nota1+Nota2)/2;
        if (Resultado>= 7)
System.out.println("aprovado");
else
System.out.println("reprovado");
}
 }
    
