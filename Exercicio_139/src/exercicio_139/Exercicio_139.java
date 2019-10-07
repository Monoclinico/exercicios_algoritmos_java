
package exercicio_139;
import java.util.Scanner;
public class Exercicio_139 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome_municipio;
        double eleitores_aptos;
        double votos_do_candidato;
        
        //proposito do programa
        System.out.println("Informa se o candidato vai para o segundo turno");
        //entrada de dados
        System.out.print("Informe o nome do municipio: ");
        nome_municipio = teclado.nextLine();
        System.out.print("Informe a quantidade de eleitores aptos: ");
        eleitores_aptos = teclado.nextDouble();
        System.out.print("Informe o numeros de votos do candidato: ");
        votos_do_candidato = teclado.nextDouble();   
        //processamento
        if (eleitores_aptos > 20000.0) {
            if (votos_do_candidato <= ((eleitores_aptos/100)*50)) {
                System.out.println("Vamos ter segundo turno em "+ nome_municipio);
            }else{
                System.out.println("Não vamos ter o segundo turno em "+ nome_municipio);
            }
        }else {
            System.out.println("Não há quantidade suficiente de eleitores aptos em "+ nome_municipio);
        }
    }
    
}
