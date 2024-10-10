package estruturaSequencial;
import java.util.Scanner;
public class VariaçãoPeso {
public static void main(String[]args){
    double PesoAtual, VariacaoPeso,NovoPeso,NovoPesoPorcentagem; 
    Scanner input= new Scanner(System.in);
System.out.println("informe seu peso atual");
    PesoAtual= input.nextDouble();
    System.out.println("digite a variação de peso");
    VariacaoPeso= input.nextDouble();
    NovoPesoPorcentagem=PesoAtual/VariacaoPeso;
    NovoPeso=PesoAtual+VariacaoPeso;
    System.out.println("variação de peso em % foi:" + NovoPesoPorcentagem); 
    System.out.printf("seu peso atual é: %.2f kg\n", NovoPeso);

}
}