import java.util.Scanner;

public class Exercicio14 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    double somaPrecoCusto = 0;
    double somaPrecoVenda = 0;
    int totalProdutos = 40;

    for (int i = 1; i <= totalProdutos; i++) {
      System.out.println("\nProduto " + i + ":");
      System.out.print("Preço de custo: R$");
      double precoCusto = scanner.nextDouble();

      System.out.print("Preço de venda: R$");
      double precoVenda = scanner.nextDouble();

      somaPrecoCusto += precoCusto;
      somaPrecoVenda += precoVenda;

      if (precoVenda > precoCusto) {
        System.out.println("Produto teve LUCRO.");
      } else if (precoVenda < precoCusto) {
        System.out.println("Produto teve PREJUÍZO.");
      } else {
        System.out.println("Produto teve EMPATE.");
      }
    }

    double mediaPrecoCusto = somaPrecoCusto / totalProdutos;
    double mediaPrecoVenda = somaPrecoVenda / totalProdutos;

    System.out.println("\nMédia de preço de custo: R$" + mediaPrecoCusto);
    System.out.println("Média de preço de venda: R$" + mediaPrecoVenda);

    scanner.close();
  }
}
