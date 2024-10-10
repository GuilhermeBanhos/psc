package whilee;
import java.util.Scanner;
public class NotaFalta {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Nota=0,NotasAlunos=0 ,MediaTurma=0 ;
        int Aluno90=0,AlunosAprov=0, AlunosReprov=0,TotalAlunos=0, Faltas=0;
        double MaiorNota= Double.NEGATIVE_INFINITY;
        double MenorNota= Double.POSITIVE_INFINITY;
      
       
        while (Nota>=0){
            System.out.println("Para encerrar o programa coloque uma nota negativa");
            System.out.println("informe a nota do aluno");
            Nota= input.nextDouble();
            System.out.println("Informe o numero de faltas");
            Faltas= input.nextInt();
            if (MaiorNota<Nota){
            MaiorNota=Nota;}

            if(Nota<MenorNota){
            MenorNota=Nota;}

            if (Nota>= 90 && Faltas<=20){
                Aluno90++;
                NotasAlunos = NotasAlunos + Nota;
                TotalAlunos++;
                MaiorNota= Nota;
                AlunosAprov++; 
            }

            else if (Nota>=70 && Faltas<=20){
            NotasAlunos= NotasAlunos + Nota;
            TotalAlunos++;
            AlunosAprov++;
             }
        
            else {
                NotasAlunos= NotasAlunos + Nota;
                TotalAlunos++;
                AlunosReprov++;}
            
            System.out.println("quantidade de alunos com nota igual ou superior a 90 : " + Aluno90);
            System.out.println("quantidade de alunos aprovados : " + AlunosAprov);
            System.out.println("quantidade de alunos que reprovaram por nota ou falta : " + AlunosReprov);
            System.out.println("Maior nota da turma: " + (MaiorNota == Double.NEGATIVE_INFINITY ? "Nenhuma nota registrada" : MaiorNota));
            System.out.println("Menor nota da turma: " + (MenorNota == Double.POSITIVE_INFINITY ? "Nenhuma nota registrada" : MenorNota));
            System.out.println("media de notas da turma : " + (MediaTurma= NotasAlunos/TotalAlunos));

        }

        
    }
    
}
