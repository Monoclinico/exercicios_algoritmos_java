package exercicio_156;
import java.util.Scanner;
public class Exercicio_156 {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int dia,mes,ano;
        boolean data=false, bissexto=false;
        System.out.println("Le uma data (dia, mês e ano em separado) e "
                + "testa se a data é válida e se o ano e bissexto.");
        //entrada de dados
        System.out.println("Infome o dia: ");
        dia = keyborad.nextInt();
        System.out.println("Infome o mes: ");
        mes = keyborad.nextInt();
        System.out.println("Infome o ano: ");
        ano = keyborad.nextInt();
        //processamento
        if (((mes >= 1 )&&(mes <= 12))&&((dia >= 1)&&(dia <= 31))&&
                ((ano >= 1)&&( ano <= 9999))) {
            
            if ((ano % 4.0) == 0){
                if ((ano % 100.0) == 0){
                    bissexto = ((ano % 400.0) == 0);
                }else{
                    bissexto = true;
                }   
            }else{
                bissexto = false;
            }
            
            if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30)) {
                data = false;
            }else{
                if (mes == 2){
                    if (bissexto){
                        data = (dia <= 29);
                    }else{
                        data = (dia <= 28);
                    }
                }else{
                    data = true;
                }
            }
        }else{
            data = false;
        }
        //saida de dados
        if (data){
            System.out.println("A data informada e valida.");
            if (bissexto){
                System.out.println("O ano e bissexto.");
            }else{
                System.out.println("O ano nao bissexto.");
            }
        }else{
            System.out.println("A data e invalida.");
        }
    }
}
