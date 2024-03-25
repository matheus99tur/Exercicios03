import java.util.Scanner;

public class Exercicio06 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o preço de custo do produto: R$ ");
    double precoCusto = scanner.nextDouble();

    System.out.print("Digite o percentual de acréscimo (%): ");
    double percentualAumento = scanner.nextDouble();

    // Calcula o valor de venda
    double valorVenda = precoCusto + (precoCusto * (percentualAumento / 100.0));

    System.out.println("\nPreço de custo: R$ " + precoCusto);
    System.out.println("Percentual de acréscimo: " + percentualAumento + "%");
    System.out.println("Valor de venda: R$ " + valorVenda);

    scanner.close();
  }
}
