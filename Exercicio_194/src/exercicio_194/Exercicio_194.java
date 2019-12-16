package exercicio_194;
import java.util.Scanner;
public class Exercicio_194 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim_superior, produto = 1;
        System.out.println("Imprime todos os numeros de 1 ate o numero limite e o produto deles");
        System.out.println("Informe o limite superior: ");
        lim_superior = teclado.nextInt();
        for (int i = 1;i<= lim_superior;i++){
            System.out.print(i+" ");
            produto *= i;
        }
        System.out.println();
        System.out.println("O produto e = "+  produto);
    }
}
