package exercicio_289;
import java.util.Scanner;
public class Exercicio_289 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, contador;
        final int NUMINTPOSITIVOS = 2;
        double media, soma_multiplos_de_3;
        System.out.println("ENTRA COM 10 NUMEROS INTEIROS POSITIVOS, E IMRPIME A MEDIA DOS NUMEROS MULTIPLOS DE 3.");
        soma_multiplos_de_3 = 0.0;
        contador = 0;
        for (int i = 1; i <= NUMINTPOSITIVOS; i++) {
            System.out.print("Entre o " + i + "º numero inteiro positivo: ");
            numero = teclado.nextInt();
            if (numero % 3.0 == 0.0) {
                soma_multiplos_de_3 = soma_multiplos_de_3 + ((double) numero);
                contador++;
            }
        }
        if (contador != 0){ 
            media = soma_multiplos_de_3 /((double) contador);
        }else{
            media = 0.0;
        }
        System.out.println("Media dos numeroeros positivos multiplos 3 e igual a: " + media);
    }
}
