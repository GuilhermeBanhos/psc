package estruturaSequencial;
import javax.swing.JOptionPane;
public class TresNotas2 {
    public static void main(String[] args) {
       String NotaA, NotaB, NotaC;
       
        double Media;
        NotaA = JOptionPane.showInputDialog("Informe sua primeirta nota");
        NotaB = JOptionPane.showInputDialog("Informe sua primeirta nota");
        NotaC = JOptionPane.showInputDialog("Informe sua primeirta nota");
        double  Nota1 = Double.parseDouble(NotaA);
        double  Nota2 = Double.parseDouble(NotaB);
        double  Nota3 = Double.parseDouble(NotaC);
        Media=(Nota1+Nota2+Nota3)/3;
            JOptionPane.showMessageDialog(null, "sua média é : " + Media );
    
}
}
