package exercicio_222;
import java.util.Scanner;
public class Exercicio_222 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Imprime uma palavra invertida");
        System.out.println("Informe a palavra: ");
        palavra = teclado.nextLine();
        System.out.println(palavra);
        for(int c = (palavra.length()-1); c >= 0; c--){
            System.out.print(palavra.charAt(c));
        }
        System.out.println();
    }
}
