import java.util.Scanner;

public class Exercicio03 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do vendedor: ");
    String nomeVendedor = scanner.nextLine();

    System.out.print("Digite o salário fixo do vendedor: R$ ");
    double salarioFixo = scanner.nextDouble();

    System.out.print("Digite o total de vendas efetuadas (em dinheiro): R$ ");
    double totalVendas = scanner.nextDouble();

    // Calcular a comissão (15% sobre o total de vendas)
    double comissao = totalVendas * 0.15;

    // Calcular o salário final (salário fixo + comissão)
    double salarioFinal = salarioFixo + comissao;

    System.out.println("\nNome do vendedor: " + nomeVendedor);
    System.out.println("Salário fixo: R$ " + salarioFixo);
    System.out.println("Comissão: R$ " + comissao);
    System.out.println("Salário final: R$ " + salarioFinal);

    scanner.close();
  }
}
