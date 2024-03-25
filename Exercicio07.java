import java.util.Scanner;

public class Exercicio07 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o custo de fábrica do carro: R$ ");
    double custoFabrica = scanner.nextDouble();

    double percentualImpostos = 0.45;
    double percentualDistribuidor = 0.28;

    double valorImpostos = custoFabrica * percentualImpostos;

    double valorComImpostos = custoFabrica + valorImpostos;

    double valorDistribuidor = valorComImpostos * percentualDistribuidor;

    double custoConsumidor = custoFabrica + valorImpostos + valorDistribuidor;

    System.out.println("\nCusto de fábrica: R$ " + custoFabrica);
    System.out.println("Valor dos impostos: R$ " + valorImpostos);
    System.out.println("Valor do distribuidor: R$ " + valorDistribuidor);
    System.out.println("Custo ao consumidor: R$ " + custoConsumidor);

    scanner.close();
  }
}
