package estruturaCondicional;
import java.util.Scanner;
public class velocidade {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Planeta;
        double VelocidadeInicial,Instante,Velocidade,Altura;
        System.out.println("Escolha um planeta "); 
        System.out.println("1= Mercurio; 2= Vênus; 3= Terra 4= Marte; 5= Júpter; 6= Saturno; 7= Urano; 8= Netuno; 9= Plutão");
        Planeta= input.nextInt();
        System.out.println("informe a Velocidade incial e o instante");
        VelocidadeInicial= input.nextDouble();
        System.out.println("Informe o instante de tempo: ");
        Instante=input.nextDouble();
        if ( Planeta == 1)  {
            Velocidade = VelocidadeInicial - 3.7*(Instante);
            Altura = VelocidadeInicial*Instante- (3.7*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
       else if ( Planeta == 2)  {
            Velocidade = VelocidadeInicial - 8.8*(Instante);
            Altura = VelocidadeInicial*Instante- (8.8*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
       else if ( Planeta ==3) {
            Velocidade = VelocidadeInicial - (9.8*(Instante));
            Altura = VelocidadeInicial*Instante- (9.8*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
       else if (Planeta == 4)  {
            Velocidade = VelocidadeInicial - 3.8*(Instante);
            Altura = VelocidadeInicial*Instante- (3.8*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
       else if (Planeta == 5)  {
            Velocidade = VelocidadeInicial - 28.4*(Instante);
            Altura = VelocidadeInicial*Instante- (28.4*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
        else if ( Planeta == 6)  {
            Velocidade = VelocidadeInicial - 11.5*(Instante);
            Altura = VelocidadeInicial*Instante- (11.5*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
        else if (Planeta == 7) {
            Velocidade = VelocidadeInicial - 9.3*(Instante);
            Altura = VelocidadeInicial*Instante- (9.3*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
         else if ( Planeta == 8)  {
            Velocidade = VelocidadeInicial - 12.2*(Instante);
            Altura = VelocidadeInicial*Instante- (12.2*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
       else if  (Planeta == 9)  {
            Velocidade = VelocidadeInicial - 0.8*(Instante);
            Altura = VelocidadeInicial*Instante- (0.8*(Math.pow(Instante, 2)))/2;
        System.out.println("V(t)= " + Velocidade);
        System.out.println("h(t)= " + Altura);   
        }
        else {
            System.out.println("Opção inválida");
        }

        
    }
    
}
