package exercicio_77;

import java.util.Scanner;

public class Exercicio_77 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double dif_pri_seg;
        double dif_quad;
        System.out.println("Calcula a diferenca de dois numeros");
        //entrada de dados
        System.out.print("Entre o primeiro numero real: ");
        numero1 = teclado.nextDouble();
        System.out.print("Entre o segundo numero real: ");
        numero2 = teclado.nextDouble();
        //processamento
        System.out.println();
        dif_pri_seg = Math.pow((numero1-numero2), 2);
        dif_quad = (Math.pow(numero1,2))-(Math.pow(numero2,2));
        //saida de dados
        System.out.println("Quadrado da diferenca = " + dif_pri_seg);
        System.out.println("Diferenca dos quadrados = " + dif_quad);
    }
    
}
