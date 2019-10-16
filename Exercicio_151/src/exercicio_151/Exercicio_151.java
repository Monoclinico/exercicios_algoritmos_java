package exercicio_151;
import java.util.Scanner;
public class Exercicio_151 {
    public static void main(String[] args) {
        //Calcula o Indice de Massa Corporal (IMC)
        Scanner teclado = new Scanner(System.in);
        double peso = 0.0, altura=0.0;
        char continuar = 'S';
        boolean encerrar = false;
        do {
            System.out.println("========================================");
            System.out.println("Calcula o IMC e retorna a faixa de risco");
            System.out.println("Deseja fazer o teste[S/N]?");
            try{
                continuar = teclado.next().trim().toUpperCase().charAt(0);
                encerrar = continuar == 'N';
                if (encerrar){
                    System.out.println("Programa encerrado");
                    break;
                }
                System.out.print("Informe o seu peso(kg): ");
                peso = teclado.nextDouble();
                System.out.print("Informe a sua altura(m): ");
                altura = teclado.nextDouble();        
            }catch(Exception e) {
                System.out.println("Resposta invalida");
                continue;
            }
            System.out.println("Seu IMC e: "+ IMC(peso,altura));
            System.out.println("Seu IMC e: "+ faixaRisco(IMC(peso,altura)));
        }while(!encerrar);
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
