package exercicio_224;
import java.util.Scanner;
public class Exercicio_224 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Imprime partes de uma palavra");
        System.out.println("Informe a palavra: ");
        palavra = teclado.nextLine();
        
        for(int c = palavra.length()-1; c >=0; c--){
            System.out.println(palavra.substring(0,c));
        }
        System.out.println();
    }
}
