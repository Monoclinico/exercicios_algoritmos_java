package exercicio_001;
import java.util.Scanner;

public class Exercicio_001 {

    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner teclado = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double perimetro;
        double area;
        // Inicio do programa
        System.out.println("Calcula perimetro e area de um retangulo");
        System.out.print("Entre o lado A: ");
        ladoA = teclado.nextDouble();
        System.out.print("Entre o lado B: ");
        ladoB = teclado.nextDouble();   
        //Processamento
        perimetro = (2 * ladoA) + (2 * ladoB);
        area = ladoA * ladoB;
        //Saida de dados
        System.out.println("Lado A = " + ladoA);
        System.out.println("Lado B = " + ladoB);
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);

    }

}
 