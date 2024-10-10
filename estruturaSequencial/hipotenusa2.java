package estruturaSequencial;
import javax.swing.JOptionPane;
public class hipotenusa2 {
    public static void main(String[] args) {
        String B,C;
        double A;
         B = JOptionPane.showInputDialog("Informe o valor de B");
         C = JOptionPane.showInputDialog("Informe o Valor de C");
         double  Bdouble = Double.parseDouble(B);
         double  Cdouble = Double.parseDouble(C);
         A= (Bdouble*Bdouble) + (Cdouble*Cdouble);
         double Raiz = Math.sqrt(A);
             JOptionPane.showMessageDialog(null, "A Hipotenusa é :" + Raiz);
}
}