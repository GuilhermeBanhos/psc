package banco;
public class ContaCorrente {
private int numero, agencia;
private double saldo;
public void iniciarContaCorrente(int n, int ag) {
numero = n;
agencia = ag;
saldo = 0;
}
public void sacar(double valor){
saldo = saldo - valor;
}

public double getSaldo(){
    return saldo;
}
public int getNumero(){
    return numero;
}
public int GetAgencia(){
    return agencia;
}

public void setConta(double saldo, int numero, int agencia){
   setSaldo(saldo); 
      setNumero(numero);
            setAgencia(agencia);
   }
   public void depositar(double valor){
saldo = saldo + valor;
}
public double consultarSaldo(){
return (saldo);
}
public String exibe() {
    return String.exibe("saldo: " + saldo \n);
}
}