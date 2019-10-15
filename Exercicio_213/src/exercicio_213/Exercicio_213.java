package exercicio_213;
import java.util.Scanner;
public class Exercicio_213 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma, numero, media;
        System.out.println("Calcula a media de 12 numeros");
        soma = 0.0;
        for (int i=1 ;i<=12;i++){
            System.out.println("Informe o numero: ");
            numero = teclado.nextDouble();
            soma += numero; 
        }
        media = soma /12.0;
        System.out.println("A media foi de: "+ media);
    }
}
