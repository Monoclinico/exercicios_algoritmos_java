package exercicio_89;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_89 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double peso_terra=0.0, peso_planeta=0.0, gravidade_terra=10.0;
        int planeta=0;
        String[] planetas = new String[6];
        planetas[0]="Mercurio";
        planetas[1]="Venus";
        planetas[2]="Marte";
        planetas[3]="Jupiter";
        planetas[4]="Saturno";
        planetas[5]="Urano";
        double[] gravidade_relativa = new double[6];
        gravidade_relativa[0]=0.37;
        gravidade_relativa[1]=0.88;
        gravidade_relativa[2]=0.38;
        gravidade_relativa[3]=2.64;
        gravidade_relativa[4]=1.15;
        gravidade_relativa[5]=1.17;
        
        System.out.println("Calcula o seu peso em outros planetas.");
        do {
        System.out.print("Informe seu peso na Terra (kg): ");
        peso_terra = teclado.nextDouble();
        for(int p=0;p<planetas.length;p++){
            System.out.println("["+(p+1)+"]"+planetas[p]);
        }
        System.out.print("Informe o planeta pela numeracao para saber o peso nele:");
        planeta = teclado.nextInt();
        }while((peso_terra <= 0.0) || (planeta < 1) ||(planeta > 6.0));
        planeta--;
        peso_planeta = (peso_terra/gravidade_terra)* gravidade_relativa[planeta];
        System.out.println("Seu peso em "+planetas[planeta]+" e "+ (df.format(peso_planeta)) +"kg.");
    }
    
}
