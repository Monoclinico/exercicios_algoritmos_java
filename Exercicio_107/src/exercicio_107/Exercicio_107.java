package exercicio_107;

import java.util.Scanner;

public class Exercicio_107 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        System.out.println("Testa se o nome é JOSE");
        //entrada de dados
        System.out.print("Entre o nome: ");
        nome = teclado.next().toUpperCase();
        //processamento e saida
        if (nome.equals("JOSE")){
            System.out.println("Você é o Jose");
        }else{
            System.out.println("Você não é o Jose");
        }
    }
    
}
