package estruturaSequencial;
import java.util.Scanner;
public class SalarioMinimo {
    public static void main(String[] args) {     
    
    double Salario, salarioMinimo, NumeroDeSalario ;
    Scanner input = new Scanner(System.in);
    System.out.println("digite seu salarioa tual");
    Salario = input.nextDouble();
    System.out.println("digite o valor do salario minimo atual");
    salarioMinimo = input.nextDouble();
    System.out.println("você recbe" + (NumeroDeSalario=Salario/salarioMinimo) + "salarios minimos");
    }
}
