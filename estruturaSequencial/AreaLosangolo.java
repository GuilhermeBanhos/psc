package estruturaSequencial;
import java.util.Scanner;
public class AreaLosangolo{
public static void main(String[]args){
  double  DiagonalMenor, DiagonalMaior, Area;
  Scanner input = new Scanner(System.in);
  System.out.println("digite o lado da diagonal maior");
  DiagonalMaior = input.nextDouble();
  System.out.println("digite o lado da diagonal menor");
  DiagonalMenor = input.nextDouble();
  System.out.println("a area deste losangolo é de " + (Area = (DiagonalMaior * DiagonalMenor)/2 ));

}

}
