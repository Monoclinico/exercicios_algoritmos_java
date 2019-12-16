package exercicio_199;
import java.util.Scanner;
public class Exercicio_199 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim_inferior, lim_superior;
        System.out.println("Imprime todos os numeros multiplos de 6 de um intervalo");
        System.out.println("Informe o limite inferior: ");
        lim_inferior = teclado.nextInt();
        System.out.println("Informe o limite superior: ");
        lim_superior = teclado.nextInt();
        for (int i = lim_inferior;i<= lim_superior;i++){
            if (i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(); 
    }
}
