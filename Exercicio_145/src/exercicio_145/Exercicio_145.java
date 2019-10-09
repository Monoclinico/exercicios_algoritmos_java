/*A biblioteca de uma universidade deseja fazer um algoritmo que leia o nome do
livro que sera emprestado, o tipo de usuario (professor ou aluno) e possa 
imprimir um recibo conforme mostrado a seguir. Considerar que o professor tem 
dez dias para devolver o livro e o aluno so tres dias.
Nome do livro:
Tipo de usuario:
Total de Dias:
 */

package exercicio_145;
import java.util.Scanner;
/**
 * @author matheussanchesleme@gmail.com
 */
public class Exercicio_145 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome_livro;
        int tipo_usuario;
        System.out.println("Informe o nome do livro:");
        nome_livro = teclado.nextLine().trim();
        System.out.println("Informe o tipo de usuario, "
                + "aluno[1] ou professor[2]: ");
        tipo_usuario = teclado.nextInt();
        if (tipo_usuario == 1){
            System.out.println("Nome do Livro: "+nome_livro);
            System.out.println("Tipo de Usuario: Aluno");
            System.out.println("Total de Dias: 3 dias");
        }else{
            if(tipo_usuario == 2){
                System.out.println("Nome do Livro: "+nome_livro);
                System.out.println("Tipo de Usuario: Professor");
                System.out.println("Total de Dias: 10 dias");
            }else{
                System.out.println("O tipo de usuario e invalido");
            }
        }
    }
    
}
