package estruturaSequencial;
import javax.swing.JOptionPane;
public class CotaçãoDolar2 {
    public static void main(String[] args) {
        String SaldoDolar,Real;
        double ValorConvertido;
         SaldoDolar = JOptionPane.showInputDialog("Informe seu saldo em dolar");
         Real= JOptionPane.showInputDialog("Informe o valor da cotação do real");
         double  SaldoDolarDouble = Integer.parseInt(SaldoDolar);
         double  RealDouble = Integer.parseInt(Real);
        ValorConvertido= RealDouble*SaldoDolarDouble;
         
             JOptionPane.showMessageDialog(null,"o valor do Saldo convertido para real é de R$:" + ValorConvertido);
    }
}
