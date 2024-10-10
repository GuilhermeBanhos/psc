package estruturaCondicional;
import java.util.Scanner;
public class Academia {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Genero;
        int Idade;
        System.out.println("escolha uma das opções:");
        System.out.println("1= homem 2= mulher");
        Genero= input.nextInt();
        System.out.println("informe sua idade");
        Idade= input.nextInt();

        if (Genero== 1 && (Idade>10 && Idade==15))
        System.out.println("Valor da Mensalidade R$:60,00");
      else if (Genero==1 && (Idade>15 && Idade<= 18))
      System.out.println("Valor da Mensalidade R$:75,00");

      else if (Genero==1 && (Idade>18 && Idade<=30))
      System.out.println("Valor da Mensalidade R$:90,00");
      else if (Genero==1 && (Idade>30 && Idade<=40))
      System.out.println("Valor da Mensalidade R$:85,00");
      else if (Genero==1 && Idade>40)
      System.out.println("Valor da Mensalidade R$:80,00");

      else if (Genero== 2 && (Idade>10 && Idade<=18))
      System.out.println("Valor da Mensalidade R$:60,00");
    else if (Genero==2 && (Idade>18 && Idade<= 25))
    System.out.println("Valor da Mensalidade R$:90,00");
    else if (Genero==2 && (Idade>26 && Idade<=40))
    System.out.println("Valor da Mensalidade R$:85,00");
    else if (Genero==2 && Idade>40)
    System.out.println("Valor da Mensalidade R$:80,00");

      
    }
}
