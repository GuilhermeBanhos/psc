package forr;
import java.util.Scanner;
public class IdadeEsexo {
    public static void main (String[]args){
    Scanner input= new Scanner(System.in);
    int Idade, Contador=0;
    String Sexo;
    for( int i=0;i<11;i++){
    System.out.println("informe sua sexualidade");
    System.out.println("F para feminino e M para masculino");
    Sexo= input.nextLine();
    System.out.println("informe sua idade:");
    Idade= input.nextInt();
    input.nextLine();
    if(Sexo.equals("F") && (Idade>=20 && Idade<=40)){
    Contador++;}
    }
    System.out.println("O número de pessoa com gênero feminino e com idades entre 20 a 40 anos são: " + Contador );
    }

}

