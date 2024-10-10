package whileDo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String entrada;
        do {
            
            entrada = JOptionPane.showInputDialog("Informe o número da conta (3 dígitos): ");
            int conta = Integer.parseInt(entrada);

            
            int centena = conta / 100;
            int dezena = (conta / 10) % 10;
            int unidade = conta % 10;
            int contaInvertida = unidade * 100 + dezena * 10 + centena;

            
            int soma = conta + contaInvertida;

            
            int multiplicacaoSoma = (soma % 10) * 3 + ((soma / 10) % 10) * 2 + ((soma / 100) % 10) * 1 + (soma / 1000) * 0;

            
            int digitoVerificador = multiplicacaoSoma % 10;

            
            JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + conta + " é: " + digitoVerificador);
            
            // Perguntar se o usuário deseja continuar
            entrada = JOptionPane.showInputDialog("Deseja processar outra conta? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

        System.exit(0);
    }
}
