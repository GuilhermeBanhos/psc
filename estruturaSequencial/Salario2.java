package estruturaSequencial;
import javax.swing.JOptionPane;
public class Salario2 {
    public static void main(String[] args) {
        String Salario, Aumento;
         double NovoSalario, Porcentagem;
         Salario = JOptionPane.showInputDialog("Informe seu salario");
         double  SalarioDouble = Double.parseDouble(Salario);
         Aumento = JOptionPane.showInputDialog("Informe o valor do auemto");
         double AumentoDouble= Double.parseDouble(Aumento);
         Porcentagem= AumentoDouble/100;
         NovoSalario= Porcentagem*SalarioDouble;
             JOptionPane.showMessageDialog(null, "Seu salario atual é de R$:" + NovoSalario );
    
}
}