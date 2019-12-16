package exercicio_196;
import java.util.Scanner;
public class Exercicio_196 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim_superior,soma=0;
        System.out.println("Imprime a soma dos numeros multiplos de 5 dentro de um intervalo");
        System.out.println("Informe o limite superior: ");
        lim_superior = teclado.nextInt();
        for (int i = 1;i< lim_superior;i++){
            if(i%5==0){
                soma+=i;
            }
        }
        System.out.println("A soma dos multiplos de 5 e = "+ soma);
    }
}
