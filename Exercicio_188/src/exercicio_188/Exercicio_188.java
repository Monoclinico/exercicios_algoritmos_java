package exercicio_188;

public class Exercicio_188 {

    public static void main(String[] args) {
        
        int i;
        System.out.println("Conversor de polegadas");
        System.out.println("======================");
        System.out.println("cm  polegadas  valor");
        System.out.println("======================");
        for(i=1;i<=10;i++){
            System.out.println(i +"cm | x 2,54 | "+(i*2.54));
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
