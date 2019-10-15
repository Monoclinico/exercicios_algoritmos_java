package exercicio_213b;
import java.util.Scanner;
public class Exercicio_213B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma, numero, media,quantidade;
        System.out.println("Calcula a media de varios numeros");
        System.out.println("Informe a quantidade de numeros");
        quantidade = teclado.nextInt();
        soma = 0.0;
        for (int i=1 ;i<=quantidade;i++){
            System.out.println("Informe o "+i+"º numero: ");
            numero = teclado.nextDouble();
            soma += numero; 
        }
        media = soma /(double)quantidade;
        System.out.println("A media foi de: "+ media);
    }
    
}
