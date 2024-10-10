package whilee;
import java.util.Scanner;
public class CidadeMedia {
    public static void main(String[]args){
    double Habitantes=0, Filhos=0, UmFilho=0, DoisFilhos=0,TresFilhos=0, MtFilhos=0, NumeroSalarios=0;
    double MediaSalario, Salario=0,SalarioTotal=0, Media1, Media2,Media3,Media4;
    Scanner input= new Scanner(System.in);
    
    while (Salario>=0){
System.out.println("Informe o salario:");
Salario= input.nextDouble();
System.out.println("Informe o numero de filhos");
Filhos= input.nextInt();
if (Filhos==0){
Habitantes++;
SalarioTotal= SalarioTotal + Salario;
NumeroSalarios++;
}

else if(Filhos==1){
UmFilho++;
Habitantes++;
SalarioTotal= SalarioTotal + Salario;
NumeroSalarios++;;}

else if (Filhos==2){
    DoisFilhos++;
    Habitantes++;
    SalarioTotal= SalarioTotal + Salario;
NumeroSalarios++;
}
else if (Filhos==3){
    TresFilhos++;
    Habitantes++;
    SalarioTotal= SalarioTotal + Salario;
NumeroSalarios++;
}
else if (Filhos>=4){
    MtFilhos++;
    Habitantes++;
    SalarioTotal= SalarioTotal + Salario;
NumeroSalarios++;
}

Media1= Habitantes/UmFilho;
Media2= Habitantes/DoisFilhos;
Media3= Habitantes/TresFilhos;
Media4= Habitantes/MtFilhos;

MediaSalario = SalarioTotal/NumeroSalarios;

System.out.println("A média salarial da população é de R$:" + MediaSalario );
System.out.println("A média de casais com 1 filhos é :" + Media1);
System.out.println("A média de casais com 2 filhos é :" + Media2);
System.out.println("A média de casais com 3 filhos é :" + Media3);
System.out.println("A média de casais com 4 ou mais filhos é :" + Media4);

    }
}
}
