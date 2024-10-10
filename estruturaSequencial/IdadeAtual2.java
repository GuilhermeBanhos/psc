package estruturaSequencial;
import javax.swing.JOptionPane;
public class IdadeAtual2 {
    public static void main(String[] args) {
        String AnoAtual,AnoNascimento,AnoFuturo;
        int Idade, IdadeFutura;
         AnoAtual = JOptionPane.showInputDialog("Informe o ano atual");
         AnoNascimento= JOptionPane.showInputDialog("Informe seu ano de nascimento");
         AnoFuturo= JOptionPane.showInputDialog("Informe o ano futuro que deseja saber sua idade");
         int  AnoAtual1 = Integer.parseInt(AnoAtual);
         int  AnoNascimento1 = Integer.parseInt(AnoNascimento);
         int  AnoFuturo1 = Integer.parseInt(AnoFuturo);
         Idade= AnoAtual1- AnoNascimento1;
         IdadeFutura = AnoFuturo1 - AnoNascimento1;
         
             JOptionPane.showMessageDialog(null,"sua idade no ano atual é " + Idade + " anos e no ano de " + AnoFuturo1 + " é " + IdadeFutura + " anos");
    }
     
}
