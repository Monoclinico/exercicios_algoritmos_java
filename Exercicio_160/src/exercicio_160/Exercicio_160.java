/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_160;
import java.util.Scanner;

public class Exercicio_160 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y;
        System.out.println("Calcula o valor de y");
        //entrada de dados
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        //processamento
        if (x <= 1.0){
           y = 1.0;
        }else {
            if ((x>1.0)&&(x<=2.0)){
                y = 2.0;
            }else{
                if ((x>2.0)&&(x<=3.0)){
                    y = x*x;
                }else{
                    y = x*x*x;
                }   
            }
        }
        System.out.println("O valor de y = "+ y);
    }
    
}
