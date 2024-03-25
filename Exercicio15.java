import java.util.Scanner;

public class Exercicio15 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    double totalDesconto = 0;
    double totalPagoClientes = 0;

    while (true) {
      System.out.print("Digite o valor do veículo (ou 0 para encerrar): R$");
      double valorVeiculo = scanner.nextDouble();

      if (valorVeiculo == 0) {
        break; // Encerra a entrada de dados
      }

      System.out.println("Escolha o tipo de combustível:");
      System.out.println("1. Álcool (25% de desconto)");
      System.out.println("2. Gasolina (21% de desconto)");
      System.out.println("3. Diesel (14% de desconto)");
      System.out.print("Opção: ");
      int opcaoCombustivel = scanner.nextInt();

      double desconto = 0;
      String tipoCombustivel = "";

      switch (opcaoCombustivel) {
        case 1:
          desconto = valorVeiculo * 0.25; // 25% de desconto
          tipoCombustivel = "Álcool";
          break;
        case 2:
          desconto = valorVeiculo * 0.21; // 21% de desconto
          tipoCombustivel = "Gasolina";
          break;
        case 3:
          desconto = valorVeiculo * 0.14; // 14% de desconto
          tipoCombustivel = "Diesel";
          break;
        default:
          System.out.println("Opção inválida.");
          continue; // Volta para o início do loop
      }

      double valorPago = valorVeiculo - desconto;
      totalDesconto += desconto;
      totalPagoClientes += valorPago;

      System.out.println("Desconto para " + tipoCombustivel + ": R$" + desconto);
      System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
    }

    System.out.println("\nTotal de desconto concedido: R$" + totalDesconto);
    System.out.println("Total pago pelos clientes: R$" + totalPagoClientes);

    scanner.close();
  }
}
