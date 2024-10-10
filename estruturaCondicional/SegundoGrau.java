package estruturaCondicional;
import java.util.Scanner;
public class SegundoGrau {
public static void main(String[]args){
    Scanner input= new Scanner(System.in);

    double a,b,c;
    double Delta,Raiz1,Raiz2;

    System.out.println("informe o valor de A");
    a= input.nextDouble();
    System.out.println("informe o valor de B ");
    b=input.nextDouble();
    System.out.println("informe o valor de C");
    c=input.nextDouble();

    if (a==0 && b==0 && c==0) 
    System.out.println("igualdade confirmada 0=0");

    else if(a==0 && b==0 && c!=0)
    System.out.println("Coeficientes informados incorretamente");

    else if (a==0 )
    System.out.println("esta é uma equação de primeiro grau x= " + -c/b);
    else
    System.out.println("é uma equação de segundo grau");

    Delta= (b*b) - 4*a*c;
    if ( Delta<0 )
    System.out.println("esta equação não possui raizes reais delta= " + Delta);
    else if (Delta==0){
    System.out.println("esta equação possui duas raizes reais");
    System.out.println("x= " + -b/(2*a));}
else {
    double Raiz = Math.sqrt(Delta);
Raiz1= (-(b)+Raiz)/2*a;
Raiz2= (-(b)-Raiz)/2*a;
    System.out.println("os valores das raizes são" + Raiz1 + "e" + Raiz2);}
}
}
