package estruturaCondicional;
import java.util.Scanner;
public class RecebaNumero {
    public static void main(String[] args) {
        int opcao;
        double Numero1, Numero2, Resultado;
        Scanner input= new Scanner(System.in); 
        System.out.println("escolha uma das opções para calcular");
        System.out.println("1- Somas os dois numeros; 2- Multipicar os dois numeros; 3- Subtrair o Numero Maior pelo Menor; 4- Dividir o primeiro número pelo segundo");
        opcao= input.nextInt();
        System.out.println("Informe dois numeros");
        Numero1= input.nextDouble();
        Numero2= input.nextDouble();
        if (opcao== 1) {
        Resultado= Numero1+Numero2;
        System.out.println(Numero1 +  " + " + Numero2 + " = " + Resultado);
        } 
        else if (opcao==2){
            Resultado= Numero1*Numero2;
            System.out.println(Numero1 +  " x " + Numero2 + " = " + Resultado);
        }
        else if (opcao==3 && Numero1> Numero2){
            Resultado= Numero1-Numero2;
            System.out.println(Numero1 +  " - " + Numero2 + " = " + Resultado);
        }
        else  {
            Resultado= Numero2-Numero1;
            System.out.println(Numero2 +  " - " + Numero1 + " = " + Resultado);
        }
        if(opcao== 4 && Numero2>0){
            Resultado=Numero1/Numero2;
            System.out.println(Numero1 +  " / " + Numero2 + " = " + Resultado);
        }
        else {
            System.out.println("numero indisponivel. o divisor não pode ser igual a 0");
        }

    }
    
}
