package estruturaSequencial;
import java.util.Scanner;
public class IdadeAtual {
    public static void main(String[] args) {
       int AnoFuturo,IdadeFutura, Idade, AnoNascimento, AnoAtual;
       Scanner input= new Scanner(System.in);
        System.out.println("Informe o ano Atual");
        AnoAtual= input.nextInt();
        System.out.println("Informe seu ano de nasicimento");
        AnoNascimento= input.nextInt();
        System.out.println("Informe o ano futuro que deseja saber sua idade");
        AnoFuturo= input.nextInt();
        Idade= AnoAtual- AnoNascimento;
        IdadeFutura = AnoFuturo - AnoNascimento;
        System.out.println("sua idade no ano atual é " + Idade + "anos e sua idade no ano de : " + AnoFuturo + " é " + IdadeFutura + " anos" );
        
    }
    
}
