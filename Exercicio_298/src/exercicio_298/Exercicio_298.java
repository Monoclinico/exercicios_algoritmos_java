
package exercicio_298;
import java.util.Scanner;

public class Exercicio_298 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int turmas, nturmas, alunos, nalunos, alunosaprovadosturma,alunosreprovadostruma;
        double nota, somanotas,mediaturma,somamediaturma, mediatotal;
        System.out.println("Calcular as medias de turmas de uma faculdade.");
        System.out.print("Entre com o numero de turmas: ");
        turmas = teclado.nextInt();
        nturmas = 0;
        somamediaturma = 0.0;
        while(nturmas < turmas){
            System.out.println("========================================================");
            System.out.print("Entre com o numero de alunos da "+(nturmas+1)+"º turma: ");
            alunos = teclado.nextInt();
            nalunos = 0;
            alunosaprovadosturma = 0;
            alunosreprovadostruma = 0;
            somanotas = 0.0;
            mediaturma = 0.0;
            while(nalunos < alunos){
                System.out.print("Entre com a nota do "+(nalunos+1)+"º aluno: ");
                nota = teclado.nextDouble();
                if (nota >= 6.0){
                    alunosaprovadosturma++;
                }else{
                    alunosreprovadostruma++;
                }
                somanotas+=nota;
                nalunos++;
            }
            if (nalunos > 0){
                mediaturma = somanotas/alunos;
                System.out.println("Alunos aprovados da turma = "+alunosaprovadosturma+" ->("+
                        (((double)alunosaprovadosturma/alunos)*100)
                        +"%) aprovados.");
                System.out.println("Alunos reprovados da turma = "+alunosreprovadostruma+" ->("+
                        (((double)alunosreprovadostruma/alunos)*100)
                        +"%) reprovados.");
                System.out.println("Media da turma = "+mediaturma);
            }else{
                System.out.println("Nao tem alunos nessa turma.");
            }
            nturmas++;
            somamediaturma+=mediaturma;
        }
        
        System.out.println("========================================================");
        mediatotal = (somamediaturma/(double)turmas);
        if (mediatotal >0){
            System.out.println("Media total da faculdade = "+mediatotal);
        }else{
            System.out.println("Nao tem medias dessa faculdade.");
        }
    }
    
}
