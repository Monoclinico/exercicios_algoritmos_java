
package exercicio_12;

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.println("Calcula a media de tres notas");
        //entrada de dados
        System.out.print("Digite a primeira nota: ");
        nota1 = keyboard.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = keyboard.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = keyboard.nextDouble();
        System.out.println("");
        //processamento
        media = (nota1 + nota2 + nota3) / 3.0d;
        //saida de dados
        System.out.println("A media do aluno e: " + media);
        if (media >= 6.0d){
            System.out.println("Aluno esta APROVADO");
        }else{
            if (media >= 3.0d){
                System.out.println("EXAME");
            }else{
                System.out.println("Aluno esta REPROVADO");
            }
            
        }
    }
    
}
