import java.util.Scanner;

public class Exercicio12 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int totalCarrosAte2000 = 0;
    int totalCarrosGeral = 0;
    char continua;

    do {
      System.out.print("Digite o ano do carro: ");
      int ano = scanner.nextInt();

      double valorOriginal;
      if (ano <= 2000) {
        valorOriginal = 30000.0; // Exemplo de valor original para carros até 2000
        totalCarrosAte2000++;
      } else {
        valorOriginal = 40000.0; // Exemplo de valor original para carros acima de 2000
      }

      double desconto;
      if (ano <= 2000) {
        desconto = valorOriginal * 0.12; // Desconto de 12% para carros até 2000
      } else {
        desconto = valorOriginal * 0.07; // Desconto de 7% para carros acima de 2000
      }

      double valorAPagar = valorOriginal - desconto;

      System.out.println("Valor do desconto: R$" + desconto);
      System.out.println("Valor a ser pago pelo cliente: R$" + valorAPagar);

      totalCarrosGeral++;

      System.out.print("Deseja continuar calculando desconto? (S/N): ");
      continua = scanner.next().charAt(0);
      scanner.nextLine(); // Limpar o buffer do scanner
    } while (continua == 'S' || continua == 's');

    System.out.println("\nTotal de carros até 2000: " + totalCarrosAte2000);
    System.out.println("Total geral de carros: " + totalCarrosGeral);

    scanner.close();
  }
}
