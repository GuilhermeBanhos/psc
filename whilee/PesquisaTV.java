package whilee;
import java.util.Scanner;
public class PesquisaTV {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Canal=1;
        double Canal2=0 ,Canal4=0 ,Canal5=0 ,Canal7=0 ,Canal12=0 ;
        double Telespectadores=0, Pessoas, Media2, Media4, Media5, Media7, Media12;
while (Canal>0){
    System.out.println("para encerrar o programa basta colocar 0 no Canal");
System.out.println("Informe o Canal assistido:");
Canal= input.nextInt();
System.out.println("Quantas pessoas estavam assitindo ao Canal?");
Pessoas= input.nextInt();
Telespectadores= Telespectadores+Pessoas;
if (Canal==2)
Canal2=Canal2+Pessoas;
else if(Canal==4)
    Canal4=Canal4+Pessoas;
else if(Canal==5)
Canal5=Canal5+Pessoas;
else if(Canal==7)
    Canal7=Canal7+Pessoas;
    else if(Canal==12){
        Canal12=Canal12+Pessoas;}

Media2= (Telespectadores/Canal2)*100;
Media4= (Telespectadores/Canal4)*100;
Media5= (Telespectadores/Canal5)*100;
Media7= (Telespectadores/Canal7)*100;
Media12= (Telespectadores/Canal12)*100;

System.out.println("Numero de pessoas assistindo ao canal 2:" + Canal2 + "e a porcentagem de pessoas vendo esse canal é : %" + Media2);
System.out.println("Numero de pessoas assistindo ao canal 4:" + Canal4 + "e a porcentagem de pessoas vendo esse canal é : %" + Media4);
System.out.println("Numero de pessoas assistindo ao canal 5:" + Canal5 + "e a porcentagem de pessoas vendo esse canal é : %" + Media5);
System.out.println("Numero de pessoas assistindo ao canal 7:" + Canal7+ "e a porcentagem de pessoas vendo esse canal é : %" + Media7);
System.out.println("Numero de pessoas assistindo ao canal 12:" + Canal12 + "e a porcentagem de pessoas vendo esse canal é : %" + Media12);
    }
    }
}

