package exercicio_104;

import java.util.Scanner;

public class Exercicio_104 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        //o que o programa faz
        System.out.println("Imprime o nome de uma "
                + "mulher que tem menos que 25 anos");

        //entrada de dados
        System.out.print("Digite o nome: ");
        nome = teclado.next();
        System.out.print("Digite o sexo[M/F]: ");
        sexo = teclado.next().toUpperCase().charAt(0);
        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        //processamento e saida
        if ((sexo == 'F') && (idade < 25)) {
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println(nome + " NÃO ACEITA");
        }
    }

}
