package whileDo;
import javax.swing.JOptionPane;
public class Atividade2 {
 public static void main (String args[]) {
 String entrada,Sexo;
 int Nota,Salario,Idade;
do{
 entrada = JOptionPane.showInputDialog("Informe sua nota: ");
 Nota = Integer.parseInt(entrada);
 entrada = JOptionPane.showInputDialog("Informe seu salario: ");
 Salario = Integer.parseInt(entrada);
 JOptionPane.showInputDialog("Informe seu sexo (M/F): ");
 Sexo= entrada;
 entrada = JOptionPane.showInputDialog("Informe sua idade: ");
 Idade = Integer.parseInt(entrada);
if (Nota>=0 && Salario>=0 && (Sexo.equalsIgnoreCase("M") || Sexo.equalsIgnoreCase("F")) && Idade>0){
System.out.println("Sucesso!");
 entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");}
 else{
 System.out.println("erro!");
 entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");}

 } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
 System.exit(0);
 }
}
