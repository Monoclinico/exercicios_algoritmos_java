package exercicio_303;
import java.util.Scanner;
public class Exercicio_303 {
    public static void main(String[] args) {
        String nome;
        char resposta;
        int cnh, numero_multas, maiores_multas, cnh_maiores_multas;
        double valor_multa, valor_multa_total, valor_total;
        
        //inicio do programa
        System.out.println("Gerenciador de arrecadacao multas do DETRAN. ");
        valor_total = 0.0;
        maiores_multas = 0;
        cnh_maiores_multas = 0;
        while (true) {
            System.out.println("===========================================================================");
            try {
                //processamento e saida de dados
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dejeja continuar? sim[S]/nao[N]: ");
                resposta = teclado.next().toUpperCase().charAt(0);
                if (resposta == 'S'){

                    System.out.print("Informe o primeiro nome da pessoa: ");
                    nome = teclado.next();

                    while (true){
                        System.out.print("Informe o numero da CNH (de 1 a 4500): ");
                        cnh = teclado.nextInt();
                        if ((cnh >= 1) && (cnh <= 4500)) {
                            break;
                        }else{
                            System.out.println("Informe um numero dentro do intervalo.");
                        }
                    }
                    System.out.print("Informe o numero de multas: ");
                    numero_multas = teclado.nextInt();
                    if (numero_multas >=maiores_multas) {
                        maiores_multas = numero_multas;
                        cnh_maiores_multas = cnh;
                    } 
                    valor_multa_total = 0.0;
                    if (numero_multas > 0){
                        for (int m=1;m<=numero_multas;m++) {
                            System.out.print("Informe o valor da "+m+"º multa: R$");
                            valor_multa = teclado.nextDouble();
                            valor_multa_total += valor_multa;
                        }
                        valor_total += valor_multa_total;
                        System.out.println("===========================================================================");
                        System.out.println(nome+" possui uma divida de: R$"+ valor_multa_total);
                    }else{
                        System.out.println("===========================================================================");
                        System.out.println(nome+" nao possui multas.");
                    }
                }else{
                    break;
                }
            }catch (Exception e){
                System.out.println("===========================================================================");
                System.out.println("ALGO DEU TREMENDAMENTE ERRADO!");
            }
        }
        System.out.println("===========================================================================");
        System.out.println("O valor total arrecadado com multas foi de : R$" + valor_total);
        if (cnh_maiores_multas != 0){
            System.out.println("O numero de CNH que teve o maior numero de multas foi: "+ cnh_maiores_multas);
        }else{
            System.out.println("Nao teve CNH registrada com multas.");
        }
    }
    
}
