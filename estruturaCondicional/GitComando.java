package estruturaCondicional;
import java.util.Scanner;
public class GitComando {
    public static void main(String[]args){
int Git;
Scanner input= new Scanner(System.in);
System.err.println("escolha um dos comandos git para explicação : 1 -git clone 2-git fetch 3- git pull;");
Git = input.nextInt();

if (Git == 1){
System.out.println("Git clone:");
System.out.println("este comando é usado para criar uma cópia local de um reposotório remoto. Ele baixa todo o conteúdo do repóstorio, incluindo o histórico de commits");
System.out.println();
System.err.println("Exemplo:");
System.out.println("git clone https://github.com/usuario/repositorio.git");
System.out.println("Neste exemplo, você está clonando um repositório hospedado no GitHub. Isso cria uma nova pasta chamada repositorio  no seu diretório atual, contendo todos os arquivos e o histórico do repositório.");}
    
else if( Git ==2){
    System.out.println("Git fetch:");
    System.out.println("este comando é usado para buscar as atualizações de um repositório remoto, mas não mescla essas alterações com a sua branch atual. Ele atualiza as referências remotas no seu repositório local.");
    System.out.println();
    System.out.println("Exemplo:");
    System.out.println("git fetch origin");
    System.out.println("Origin é o nome padrão do repositório remoto. Esse comando vai buscar todas as alterações feitas no repositório remoto, mas não as aplicará à sua branch atual. Você pode usar git log origin/main para visualizar os commits que foram adicionados.");
}
else if (Git ==3){
    System.out.println("Git pull");
    System.out.println("este comando é uma combinação de git fetch e git merge ( git merge é um comando do Git utilizado para combinar as alterações de duas branches diferentes em uma única branch). ");
System.out.println("Ele busca as atualizações do repositório remoto e automaticamente tenta mesclá-las com a sua branch atual. Se você estiver na branch main, por exemplo, o comanado irá buscar alterções na branch main do repositório remoto e mesclá-las");
System.out.println();
System.out.println("Exemplos: ");
System.out.println("git pull origin main");
System.out.println("Neste caso, o comando está buscando e mesclando as alterações da branch main do repositório remoto origin com a sua branch main local");
}
else
System.out.println("opção inválida");
}
}