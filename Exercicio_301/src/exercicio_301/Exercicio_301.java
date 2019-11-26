/*
 * Algoritmo da materia do Deluque
 */
package exercicio_301;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author Aluno GTI
 */
public class Exercicio_301 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracao de variaveis e objetos
        DecimalFormat formatador_decimal = new DecimalFormat();
        formatador_decimal.applyPattern("0.0");
        Scanner teclado = new Scanner(System.in);
        int alunos, acima_de_200,pessoal_maior_familiar;
        double renda_pessoal, renda_familiar, despesa_alimentacao, 
            despesa_outras, porcentagem_gastos;
        char resposta; 
        alunos = 0;
        acima_de_200=0;
        pessoal_maior_familiar=0;
        renda_pessoal = 1.0;
        //Inicio do programa
        System.out.println("=============================================");
        System.out.println("FAZ A GESTAO DE RENDA DE ALUNOS DE UMA "
                + "FACULDADE.");
        //Entrada e saida de dados
        while (renda_pessoal > 0.0){
            System.out.print("DESEJA CONTINUAR[S/N]?");
            try {
                resposta = teclado.next().toUpperCase().charAt(0);
                if (resposta == 'S'){
                    System.out.println("============================="
                            + "================");
                    System.out.println(">>>>>>>>>>> "+(alunos+1)+"º ALUNO "
                            + "<<<<<<<<<<<");
                    System.out.print("Informe a renda pessoal: R$");
                    renda_pessoal = teclado.nextDouble();
                    if (renda_pessoal >0.0){
                        alunos++;
                        System.out.print("Informe a renda familiar: R$");
                        renda_familiar = teclado.nextDouble();
                        System.out.print("Informe a despesa de "
                                + "alimentacao: R$");
                        despesa_alimentacao = teclado.nextDouble();
                        System.out.print("Informe a outras despesas: R$");
                        despesa_outras = teclado.nextDouble();
                        if (despesa_outras > 200.0){
                            acima_de_200++;
                        }
                        if (renda_pessoal > renda_familiar){
                            pessoal_maior_familiar++;
                        }
                        porcentagem_gastos = (100 * (despesa_alimentacao + 
                                despesa_outras))/(renda_familiar + 
                                renda_pessoal);
                        System.out.println("A porcentagem de gastos do "
                                + "aluno: "+ (formatador_decimal.format
                                (porcentagem_gastos))+"%.");
                    }else{
                        System.out.println("A renda pessoal e menor ou "
                                + "igual a 0.");
                    }
                    System.out.println("====================================="
                            + "========");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("*** OPS! ALGO DEU ERRADO. ***");
                System.out.println("ERRO: "+e.toString());
                renda_pessoal = 1.0;
                break;
            }
        }
        if (alunos>0){
            System.out.println(acima_de_200+" "
                    + "alunos gastam mais de R$200,00 com outras despesas.");
            System.out.println(pessoal_maior_familiar+
                    " alunos tem renda pessoal maior que renda familiar.");
        }else{
            System.out.println("Nenhum aluno foi contabilizado.");
        }
        System.out.println("=============================================");
        System.out.println("PROGRAMA ENCERRADO.");
    } 
}