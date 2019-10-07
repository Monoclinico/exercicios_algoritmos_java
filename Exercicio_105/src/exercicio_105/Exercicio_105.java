package exercicio_105;
import java.util.Scanner;
public class Exercicio_105 {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sigla;
        String resposta;
        System.out.println("Imprime a naturadide do individuo");
        
//entrada de dados
        System.out.print("Entre com a sigla "
                + "do estado[SP/RJ/MG/OT=outros]: ");
        sigla = teclado.next();
        sigla = sigla.toUpperCase();
        
//processamento
        if (sigla.equals("SP")){
            resposta = "Paulista";
        }else if (sigla.equals("RJ")){
            resposta = "Carioca";
        }else if (sigla.equals("MG")){
            resposta = "Mineiro";
        }else{
            resposta = "Outros estados";
        }
//saida de dados
        System.out.println("Naturalidade = " + resposta);
    }
    
    
}
