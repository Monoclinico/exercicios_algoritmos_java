package exercicio_223;
import java.util.Scanner;
public class Exercicio_223 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Imprime partes de uma palavra");
        System.out.println("Informe a palavra: ");
        palavra = teclado.nextLine();
        
        for(int c = 0; c< palavra.length(); c++){
            System.out.println(palavra.substring(0, c+1));
        }
        System.out.println();
    }
}
