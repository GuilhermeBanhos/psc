package estruturaSequencial;
import javax.swing.JOptionPane;
public class Raio2 {
    public static void main(String[] args) {
        String Raio;
        double Comprimento, Area, Volume;
        Raio = JOptionPane.showInputDialog("Informe seu salario");
        double RaioDouble= Double.parseDouble(Raio);
        Comprimento= 2 * 3.14* RaioDouble;
        Area= 3.14*Math.pow(RaioDouble, 2);
        Volume= 3/4*3.14*Math.pow(RaioDouble, 3);
        JOptionPane.showMessageDialog(null,"Comprimeto= " + Comprimento + 
        " Area= " + Area +
        " Volume= " + Volume);
    }
}
