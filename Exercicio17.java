import java.util.Scanner;

public class Exercicio17 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do funcionário: ");
    String nomeFuncionario = scanner.nextLine();

    System.out.print("Digite o salário atual do funcionário: R$");
    double salarioAtual = scanner.nextDouble();

    System.out.print("Digite o valor do salário mínimo: R$");
    double salarioMinimo = scanner.nextDouble();

    double novoSalario = 0;
    double reajuste = 0;

    // Calculando o reajuste de acordo com a faixa salarial
    if (salarioAtual < 3 * salarioMinimo) {
      reajuste = 0.5; // 50% de aumento
    } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
      reajuste = 0.2; // 20% de aumento
    } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
      reajuste = 0.15; // 15% de aumento
    } else {
      reajuste = 0.1; // 10% de aumento
    }

    novoSalario = salarioAtual + (salarioAtual * reajuste);

    System.out.println("\nFuncionário: " + nomeFuncionario);
    System.out.println("Salário atual: R$" + salarioAtual);
    System.out.println("Reajuste (" + (reajuste * 100) + "%): R$" + (salarioAtual * reajuste));
    System.out.println("Novo salário: R$" + novoSalario);

    // Calculando a diferença na folha de pagamento
    double diferencaFolha = novoSalario - salarioAtual;
    System.out.println("\nA empresa aumentará em sua folha de pagamento: R$" + diferencaFolha);

    scanner.close();
  }
}
