

package exercicio_190;

import java.util.Scanner;
public class Exercicio_190 {

    
    public static void main(String[] args) {
        int i,idade;
        String nome;
        char sexo;
        Scanner teclado = new Scanner(System.in);
        for (i=1;i<=20;i++){
            System.out.println("=====================");
            System.out.println("Informe o nome:");
            nome = teclado.next();
            System.out.println("Informe a idade:");
            idade = teclado.nextInt();
            System.out.println("Informe o sexo[M/F]:");
            System.out.println("=====================");
            sexo = teclado.next().trim().toUpperCase().charAt(0);
            if ((sexo == 'M') && (idade > 21)){
                System.out.println("O nome e: "+ nome);
                System.out.println("A idade e: "+ idade);
            }
        }
    }
    
}
