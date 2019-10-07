package exercicio_174b;

public class Exercicio_174B{
    public static void main(String[] args) {
        int i;
        System.out.println("Imprime os numeros pares de 1 a 100");
        for(i=1;i<=100;i++){
            if (i%2.0 == 0){
                System.out.println("Numero par = "+i);
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}
