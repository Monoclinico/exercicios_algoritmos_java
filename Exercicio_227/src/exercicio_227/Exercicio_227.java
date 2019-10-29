package exercicio_227;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Exercicio_227 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Imprime partes de uma palavra");
        System.out.println("Informe a palavra: ");
        palavra = teclado.nextLine();

        for(int c = (palavra.length() - 1); c >= 0; c--){
            System.out.println(palavra.substring(c));
        }
        System.out.println();
    }
    
}
