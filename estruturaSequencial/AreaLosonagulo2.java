package estruturaSequencial;
import javax.swing.JOptionPane;
public class AreaLosonagulo2 {
    public static void main(String[] args) {
        String LadoMenor, LadoMaior;
        double Area;
         LadoMenor = JOptionPane.showInputDialog("Informe o lado menor do losangulo");
         LadoMaior = JOptionPane.showInputDialog("Informe o lado maior do losanfgulo");
         double  LadoMenorDouble = Double.parseDouble(LadoMenor);
         double  LadoMaiorDouble = Double.parseDouble(LadoMaior);
         Area = (LadoMaiorDouble*LadoMenorDouble)/2;
             JOptionPane.showMessageDialog(null, "A area do losangolo é : " + Area);
}
}