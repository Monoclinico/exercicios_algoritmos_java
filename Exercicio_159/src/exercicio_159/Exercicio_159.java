package exercicio_159;
import java.util.Scanner;
public class Exercicio_159 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        System.out.println("Calcula o valor de f(x)");
        //entrada de dados
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        //processamento
        if ((x == 4.0) ||(x == -4.0)){
            System.out.println("Nao tem solucao, denominador = 0");
        }else {
            fx = ((5.0 * x) + 3.0)/((x*x)-16.0);
            System.out.println("O valor de f(x)= "+ fx);
        }
    }
    
}
