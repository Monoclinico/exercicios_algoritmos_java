
package exercicio_140;

import java.util.Scanner;

public class Exercicio_140 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor_da_conta;
        String nome;
        char inicial;
        
        
        System.out.println("Verifica se um cliente de um restaurante poderá receber desconto");
        System.out.print("Informe o nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe o valor total da conta: ");
        valor_da_conta = teclado.nextDouble();
        //processamento
        inicial = nome.toUpperCase().charAt(0);
        if (( inicial == 'A') || (inicial == 'D') || (inicial == 'M') || ( inicial == 'S')) {
            System.out.println("Parabens, "+ nome + "! Voce recebeu 30% de desconto: R$ " + 
                    (valor_da_conta * 0.7));
        
        }else{
            System.out.println("QUE PENA, NESTA SEMANA O DESCONTO NAO E PARA SEU"
                    + " NOME, MAS CONTINUE PRESTIGIANDO QUE SUA VEZ CHAGARA!");
        }
    }
    
}
