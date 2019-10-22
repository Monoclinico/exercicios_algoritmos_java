package exercicio_151;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_151 {
    public static void main(String[] args) {
        //Calcula o Indice de Massa Corporal (IMC)
        double peso = 0.0, altura=0.0, imc=0.0;
        char continuar = 'S';
        boolean encerrar = false;
        do {
            System.out.println("========================================");
            System.out.println("Calcula o IMC e retorna a faixa de risco");
            System.out.println("Deseja fazer o teste[S/N]?");
            try{
                Scanner teclado = new Scanner(System.in);
                DecimalFormat arredondar = new DecimalFormat("#0.00");
                continuar = teclado.next().trim().toUpperCase().charAt(0);
                encerrar = continuar == 'S';
                if (!encerrar){
                    System.out.println("Programa encerrado");
                    break;
                }
                System.out.print("Informe o seu peso(kg): ");
                peso = teclado.nextDouble();
                System.out.print("Informe a sua altura(m): ");
                altura = teclado.nextDouble();        
                imc = IMC(peso,altura);
                System.out.println("O IMC e: "+ arredondar.format(imc)); //imc com 2 casas decimais
                System.out.println("Representa: "+ faixaRisco(imc));
            }catch(Exception e) {
                System.out.println("Resposta invalida");
            }
        }while(encerrar);
    }
    public static double IMC(double peso, double altura){
        if ((peso>0.0)&&(altura>0.0)){
            
            double p = peso, a = altura, imc=0.0;
            imc = p/(a*a);
            return  imc;
        }else{
            return 0.0;
        }
    }
    public static String faixaRisco(double imc){
            String faixa_risco;
            if (imc >30.0){
                if(imc <= 35.0){
                   faixa_risco = "obesidade";
                }else{
                   faixa_risco = "obesidade mórbida";
                }
            }else{
                if(imc > 25.0){
                   faixa_risco = "excesso de peso";
                }else{
                    if(imc >= 20.0){
                        faixa_risco = "normal";
                    }else{
                        if (imc >0.0){
                            faixa_risco = "abaixo do peso";
                        }else{
                            faixa_risco = "peso invalido";
                        }
                    }
                }
            }
            return faixa_risco;
    }
    
}
