package matriz;
import java.util.*;
public class cincoporcinco {
    public static void main(String[] args) {
        int [][] Matriz= new int [5][5];
int i,j;
Scanner input= new Scanner(System.in);

for (i=0; i<Matriz.length; i++){
    for (j=0; j<Matriz[i].length; j++){
        System.out.println("informe um numero");
        Matriz[i][j]= input.nextInt();
    }
}
System.out.println("Valores da Matriz informada:");
for (i = 0; i < Matriz.length; i++) {

for (j = 0; j < Matriz[i].length; j++)

System.out.printf("%2d ", Matriz[i][j]);

System.out.println();

    }
}
    }

