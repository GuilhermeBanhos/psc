package forr;
import java.util.Scanner;
public class IdadePeso {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        int Peso, ContadorF=0, ContadorM=0;
    String Sexo;
    for( int i=0;i<10;i++){
    System.out.println("informe sua sexualidade");
    System.out.println("F para feminino e M para masculino");
    Sexo= input.nextLine();
    System.out.println("informe seu peso:");
    Peso= input.nextInt();
    input.nextLine();
    if(Sexo.equals("F") && (Peso>=50 && Peso<=70)){
    ContadorF++;}
    else if(Sexo.equals("M") && (Peso>=60 && Peso<=80)){
    ContadorM++;
    }
}
    System.out.println("O número de mulheres com o peso entre 50 a 70 kilos são: " + ContadorF );
    System.err.println("O número de homens com o peso entre 60 a 80 kilos são: " + ContadorM);

}
    }

