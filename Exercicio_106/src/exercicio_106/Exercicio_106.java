package exercicio_106;

import java.util.Scanner;

public class Exercicio_106 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        System.out.println("Testa se um nome comeca "
                + "com a letra \'A\' ");
        System.out.print("Digite o nome: ");
        //entrada de dados e processamento
        
        nome = teclado.next().toUpperCase();
        
        //saida dados
        if (nome.charAt(0) == 'A' ){
            System.out.println("O nome "+ nome+" começa com \'A\'.");
        }else{
            System.out.println("O nome "+ nome + " não começa com \'A\'.");
        }
    }
        
    
}
