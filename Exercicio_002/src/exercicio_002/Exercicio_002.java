package exercicio_002;

import java.util.Scanner;


public class Exercicio_002 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double raio, pi, perimetro, area;
        pi = Math.PI;
        System.out.print("Digite o raio do círculo: ");
        raio = keyboard.nextDouble();
        area = pi * raio * raio;
        perimetro = pi * raio * 2;
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perimetro do círculo é: " + perimetro);
        
    }            
}
