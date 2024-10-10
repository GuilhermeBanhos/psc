package estruturaSequencial;
import javax.swing.JOptionPane;
public class Celsius2 {
    public static void main(String[] args) {
        String C;
        double Fahrenheit;
         C = JOptionPane.showInputDialog("Informe o valor em Celsius");
         double  Celsius2 = Integer.parseInt(C);
        Fahrenheit= (Celsius2*1.8) + 32;
             JOptionPane.showMessageDialog(null,"o valor do Celsius para Fahrenheit é =" + Fahrenheit );
    }
}
