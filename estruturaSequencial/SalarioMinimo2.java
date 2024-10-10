package estruturaSequencial;
import javax.swing.JOptionPane;
public class SalarioMinimo2 {
    public static void main(String[] args) {
        String Salario, SalarioMinimo;
         double NumeroDeSalarios;
         Salario = JOptionPane.showInputDialog("Informe seu salario");
         double  SalarioDouble = Double.parseDouble(Salario);
         SalarioMinimo = JOptionPane.showInputDialog("Informe o valor do salario minimo");
         double SMDouble= Double.parseDouble(SalarioMinimo);
         NumeroDeSalarios= SalarioDouble/SMDouble;
             JOptionPane.showMessageDialog(null, "Seu salario atual equivale a " + NumeroDeSalarios  + "minimos");
    
}
}
