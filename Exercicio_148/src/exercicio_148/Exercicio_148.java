/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_148;
import java.util.Scanner;
/**
 *
 * @author matheussanchesleme@gmail.con
 */
public class Exercicio_148 {

    /**
     * @param args nenhum
     */
    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in);
        int regiao = 0;
        int passagens = 0;
        boolean ida_volta = false;
        double valor_total = 0.0;
        double[] valor_ida = {500.0,350.0,350.0,290.0,300.0};
        double[] valor_ida_volta = {900.0,650.0,600.0,500.0,550.0};
        String[] regioes = {"Norte","Nordeste","Centro-Oeste","Sudeste","Sul"};
        System.out.println("Para qual regiao do Brasil e a viagem, escolha dentre as opcoes abaixo de passagem por pessoa: ");
        System.out.println("Regiao Norte        | Só Ida: R$500,00 | Ida e Volta: R$900,00 | Opcao 1");
        System.out.println("Regiao Nordeste     | Só Ida: R$350,00 | Ida e Volta: R$650,00 | Opcao 2");
        System.out.println("Regiao Centro-Oeste | Só Ida: R$350,00 | Ida e Volta: R$600,00 | Opcao 3");
        System.out.println("Regiao Sudeste      | Só Ida: R$290,00 | Ida e Volta: R$500,00 | Opcao 4");
        System.out.println("Regiao Sul          | Só Ida: R$300,00 | Ida e Volta: R$550,00 | Opcao 5");
        System.out.print("Escolha uma dentre as 5 opcoes de regioes: ");
        regiao = entrada_dados.nextInt();
        System.out.print("Informe quantas passagens: ");
        passagens = entrada_dados.nextInt();
        System.out.println("Só com ida[1] ou com ida e volta[2]: ");
        ida_volta = (entrada_dados.nextInt()) == 2;
        if (ida_volta){
            valor_total = valor_ida_volta[regiao-1] * passagens;
        }else{
            valor_total = valor_ida[regiao-1] * passagens;
        }
        System.out.println("Passagens: " + passagens);
        System.out.println("Para a Regiao " + regioes[regiao-1]);
        System.out.println("Valor total: R$" + valor_total);

    }
    
}
