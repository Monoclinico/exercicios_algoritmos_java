
package palindromo;
/**
 *Programa que testa se uma cadeia de caracteres (String) e um palindromo. 
 * email do autor: matheussanchesleme@gmail.com
 */
import java.util.Scanner;

public class Palindromo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto, texto_sem_espacos;
        boolean palindromo = false;
        
        System.out.print("Digite o texto (nao use acentos ou simbolos): ");
        texto = teclado.nextLine();
        texto_sem_espacos = texto.trim().toUpperCase().replaceAll(" ", "");
        
        for (int c = 0, d = (texto_sem_espacos.length()-1); 
                (c<texto_sem_espacos.length()) && (d >= 0) ;c++, d--) { 
            if (texto_sem_espacos.charAt(c) != texto_sem_espacos.charAt(d)){
                palindromo = false;
                break;
            }else{
                palindromo = true;
            }
        }
        if (palindromo) {
            System.out.println("O texto: \"" + texto + "\" e PALINDROMO.");
        }else{
            System.out.println("O texto: \"" + texto + 
                    "\" nao e PALINDROMO.");
        }
    }
    
}
