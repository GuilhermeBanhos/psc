package estruturaSequencial;
import javax.swing.JOptionPane;
public class Tabuada2 {
    public static void main(String[] args) {
        String Numero;
        Numero = JOptionPane.showInputDialog("Informe um numero");
        int NumeroInt = Integer.parseInt(Numero);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*0);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*1);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*2);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*3);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*4);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*5);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*6);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*7);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*8);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*9);
        JOptionPane.showMessageDialog(null, NumeroInt + "x" + Numero + "=" + NumeroInt*10);


    }
}
