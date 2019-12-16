package exercicio_158;
import java.util.Scanner;
public class Exercicio_158 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        System.out.println("Calcula o valor de f(x)");
        //entrada de dados
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        //processamento e saida
        if (x == 2.0){
            System.out.println("Nao tem solucao, denominador = 0");
        }else {
            fx = (8.0)/(2.0-x);
            System.out.println("O valor de f(x)= "+ fx);
        }
    }
}
