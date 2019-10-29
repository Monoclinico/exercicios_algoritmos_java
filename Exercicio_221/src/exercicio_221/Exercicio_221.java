package exercicio_221;
import java.util.Scanner;
public class Exercicio_221 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Imprime uma palavra na vertical");
        System.out.println("Informe a palavra: ");
        palavra = teclado.nextLine();
        palavra = palavra.toUpperCase();
        System.out.println(palavra);
        for(int c = 0; c < palavra.length(); c++){
            System.out.println(palavra.charAt(c));
        }
    }
}