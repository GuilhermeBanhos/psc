package estruturaCondicional;
import java.util.Scanner;
public class codigoloja {
    public static void main(String[] args) {
        double Cod;
        Scanner input= new Scanner(System.in);
        System.out.println("digite o codigo do produto");
        Cod = input.nextDouble();
        if (Cod == 1) {
            System.out.println("Sapato R$99,99");
        } else if (Cod==2) {
            System.out.println("Bolsas R$ 103,89");
        } else if (Cod==3) {
            System.out.println("Camisa R$ 49,98");   
        } else if (Cod==4) {
            System.out.println("Calça R$89,72");
        } else if (Cod==5) {
            System.out.println("Blusa R$ 97,35");
        } else { 
            System.out.println("Codigo invalido"); 
        }
            
        }
    }
