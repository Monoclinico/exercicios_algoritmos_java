package exercicio_001;
import java.util.Scanner;
public class Exercicio_001 {
    public static void main(String[] args) {
        //Declaração de variaveis
        double ladoA=0., ladoB=0., perimetro=0., area=0.;
        // Inicio do programa
        System.out.println("Calcula perimetro e area de um retangulo");
        while(true){
            try{
                Scanner teclado = new Scanner(System.in);        
                System.out.print("Entre o lado A: ");
                ladoA = teclado.nextDouble();
                System.out.print("Entre o lado B: ");
                ladoB = teclado.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Algo deu errado na entrada de dados, "
                        + "tente novamente.");
            }
        }
        //Processamento
        perimetro = (ladoA * 2) + (ladoB * 2);
        area = ladoA * ladoB;
        //Saida de dados
        System.out.println("Lado A = " + ladoA);
        System.out.println("Lado B = " + ladoB);
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);
    }
}
 