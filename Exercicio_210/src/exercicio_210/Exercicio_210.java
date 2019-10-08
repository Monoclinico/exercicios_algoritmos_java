/*
A série de FETUCCINE é gerada da seguinte forma: os dois primeiros termos são
fornecidos pelo usuário; a partir daí, os termos são gerados com a soma ou subtração
dos dois termos anteriores, ou seja:
A, = A1-1 + A1-2 para I ímpar
A, = A1-1- A1-2 para I par
Criar um algoritmo que imprima os N primeiros termos da série de FETUCCINE.
*/
package exercicio_210;
import java.util.Scanner;
/**
 *
 * @author matheussanchesleme@gmail.com
 */
public class Exercicio_210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a=0,b=0,c=0,n=0;
        System.out.print("Informe o primeiro termo: ");
        a = teclado.nextInt();
        System.out.print("Informe o segundo termo: ");
        b = teclado.nextInt();
        System.out.print("Informe a quantidade de termos desejada: ");
        n = teclado.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i=3;i<=n;i++){
            if (i % 2.0 == 0){
                c = b - a;
            }else{
                c = b + a;
            }
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
