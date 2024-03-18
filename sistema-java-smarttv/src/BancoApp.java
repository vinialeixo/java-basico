import java.text.DecimalFormat;
import java.util.Scanner;


public class BancoApp {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                DecimalFormat df = new DecimalFormat("#.##");
   
                double valorInicial = scanner.nextDouble();
                
                double taxaJuros = scanner.nextDouble();
                
                int periodo = scanner.nextInt();
                
               
        
                double valorFinal = calcJurosCompostos(valorInicial,(taxaJuros/100),periodo);
                //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        
                System.out.println("Valor final do investimento: R$ " + df.format(valorFinal) );
                scanner.close();
            } catch (Exception e) {
                System.out.println("Valor da taxa de juros informado incorretamente");
            }
             
    }

    static double calcJurosCompostos(double valorInicial,double taxaJuros, int periodo ){

        for (int i = 0; i < periodo; i++){
            valorInicial = (valorInicial * taxaJuros) + valorInicial;
            
        }
        
        return valorInicial;
    }

}
