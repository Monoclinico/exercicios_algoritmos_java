package exercicio_192;
import java.util.Scanner;
public class Exercicio_192 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim_superior;
        System.out.println("Imprime todos os numeros impares menores que um numero limite");
        System.out.println("Informe o limite superior: ");
        lim_superior = teclado.nextInt();
        for (int i = 1;i< lim_superior;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
