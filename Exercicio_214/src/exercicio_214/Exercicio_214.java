package exercicio_214;
import java.util.Scanner;
public class Exercicio_214 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma_media, media, media_total,nota1,nota2;
        String nome;
        System.out.println("Calcula a media de duas notas dos alunos de uma sala");
        System.out.println("Calcula a media geral de uma sala");
        
        soma_media = 0.0;
        for (int i=1 ;i<=10;i++){
            System.out.println("Informe o nome do aluno: ");
            nome = teclado.next();
            System.out.println("Informe a nota P1: ");
            nota1 = teclado.nextDouble();
            System.out.println("Informe a nota P2: ");
            nota2 = teclado.nextDouble();
            media = (nota1 + nota2)/2.0;
            soma_media += media; 
            System.out.println("O aluno "+nome+", teve media: "+media);
        }
        media_total = soma_media /10.0;
        System.out.println("A media geral foi de: "+ media_total);
    }
    
}
