/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_299;
import java.util.Scanner;

/**
 *
 * @author Aluno GTI
 */
public class Exercicio_299 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //==========Declaracao das variaveis========
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        boolean aprovado; 
        String nome;
        int aprovadosMateria3 = 0;
        final int NUMERO_DE_ALUNOS = 2;
        final int NUMERO_DE_NOTAS = 5;
        //==========Inicio==========================
        System.out.println("Informa o estado dos alunos de uma sala de acordo com suas notas.");
        //==========Entrada de dados================
        for (int i=1;i<=NUMERO_DE_ALUNOS; i++){
            aprovado = true;
            System.out.println("Informe o nome do aluno: ");
            nome = teclado.next();
            for (int n=1;n<=NUMERO_DE_NOTAS;n++){
                System.out.println("Informe a "+n+"º nota");
                notas[n-1] = teclado.nextDouble();
                if (notas[n-1] < 6.0){
                    aprovado = false;
                }
            }
            //============Saida de dados============
            if (aprovado){
                System.out.println(nome + " esta aprovado em todas.");
            }else {
                System.out.println(nome + " esta reprovado em alguma materia.");
            }
            if ((notas[0] < 6.0) && (notas[3] < 6.0)){
                System.out.println(nome + " esta reprovado nas materias 1 e 4." );
            }else{
                System.out.println(nome + " esta aprovado nas materias 1 e 4." );
            }
            if (notas[2]>=6.0){
                aprovadosMateria3++;
            }
        }
        System.out.println("A porcentagem dos alunos aprovados na materia 3: "
                +((aprovadosMateria3/NUMERO_DE_ALUNOS)*100.0)+"%");
    }
    
}
