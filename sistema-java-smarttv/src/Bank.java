import java.util.Scanner;

/**
 * Bank
 */
public class Bank {

      public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    String saldoDisponivel = calcBank (saldoTotal,valorSaque);
    System.out.println(saldoDisponivel);
    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  }
  static String calcBank(int saldoTotal, int valorSaque ){
    int saldoDisponivel = saldoTotal - valorSaque;
        return saldoTotal >= valorSaque ? "Saque realizado com sucesso! Novo saldo: "+saldoDisponivel : "Saldo insuficiente. Saque nao realizado!";
  } 
}