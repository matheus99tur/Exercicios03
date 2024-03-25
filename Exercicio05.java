import java.util.Scanner;

public class Exercicio05 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor total da compra: R$ ");
    double valorCompra = scanner.nextDouble();

    // Calcular o valor das prestações
    double valorPrestacao = valorCompra / 5;

    System.out.println("\nValor total da compra: R$ " + valorCompra);
    System.out.println("Valor de cada prestação (5 vezes sem juros): R$ " + valorPrestacao);

    scanner.close();
  }
}
