package estruturaSequencial;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {     
    
    double salario, aumento, novoSalario, porcentagem;
    Scanner input = new Scanner(System.in);
    System.out.println("digite o seu salario atual");
    salario = input.nextDouble();
    System.out.println("digite a porcentagem do aumeto");
    aumento = input.nextDouble();
    porcentagem = aumento /100;
    novoSalario = porcentagem * salario ;
    System.out.println("seu salario atual é R$:" +( salario + novoSalario));


    }
    
}