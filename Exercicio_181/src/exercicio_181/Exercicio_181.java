
package exercicio_181;

public class Exercicio_181 {

    public static void main(String[] args) {
        
        int i;
        System.out.println("Imprime a soma e o quadrado de numeros de 1 a 100");
        for(i=1;i<=100;i++){
            System.out.print("A soma de i+i = "+(i+i)+" | ");
            System.out.println("O quadrado de i*i = "+(i*i));
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
