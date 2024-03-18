import java.util.Scanner;

public class EquilibrandoConta {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        double total = calcSaldoConta(saldoAtual,valorDeposito,valorRetirada);

        System.out.println(total);
        scanner.close();

    }
    
    static double calcSaldoConta(double saldoAtual, double valorEntrada, double valorSaida){
      return saldoAtual + valorEntrada - valorSaida;
    }
}
