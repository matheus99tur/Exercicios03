import java.util.Scanner;

public class Exercicio04 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a cotação do dólar (R$): ");
    double cotacaoDolar = scanner.nextDouble();

    System.out.print("Digite a quantidade de dólares: ");
    double quantidadeDolares = scanner.nextDouble();

    // Calcular o valor em reais
    double valorEmReais = cotacaoDolar * quantidadeDolares;

    System.out.println("\nValor em dólar: US$ " + quantidadeDolares);
    System.out.println("Cotação do dólar: R$ " + cotacaoDolar);
    System.out.println("Valor em reais: R$ " + valorEmReais);

    scanner.close();
  }
}
