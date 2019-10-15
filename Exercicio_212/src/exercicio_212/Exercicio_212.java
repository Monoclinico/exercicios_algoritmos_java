package exercicio_212;
import java.util.Scanner;
public class Exercicio_212 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma, numero; 
        System.out.println("Imprime a soma dos numeros cujos quadrados sao menores que 25");
        soma = 0.0;
        for (int i=1 ;i<=20;i++){
            System.out.println("Informe o "+i+"º numero: ");
            numero = teclado.nextDouble();
            if ((numero * numero) < 25.0){
                //soma += numero; 
                soma = soma + numero;
            } 
        }
        System.out.println("A soma total e: "+ soma);
    }
}
