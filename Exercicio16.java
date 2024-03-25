import java.util.Scanner;

public class Exercicio16 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Definir o valor do salário mínimo
    double salarioMinimo = 1100.00; // Exemplo, valor do salário mínimo

    System.out.print("Digite o número de funcionários: ");
    int numFuncionarios = scanner.nextInt();

    for (int i = 1; i <= numFuncionarios; i++) {
      System.out.println("\nFuncionário #" + i);
      System.out.print("Digite o salário do funcionário: R$");
      double salarioFuncionario = scanner.nextDouble();

      double novoSalario = 0;

      if (salarioFuncionario < 3 * salarioMinimo) {
        novoSalario = salarioFuncionario * 1.5; // Aumento de 50%
      } else if (salarioFuncionario >= 3 * salarioMinimo && salarioFuncionario <= 10 * salarioMinimo) {
        novoSalario = salarioFuncionario * 1.2; // Aumento de 20%
      } else if (salarioFuncionario > 10 * salarioMinimo && salarioFuncionario <= 20 * salarioMinimo) {
        novoSalario = salarioFuncionario * 1.15; // Aumento de 15%
      } else {
        novoSalario = salarioFuncionario * 1.1; // Aumento de 10%
      }

      System.out.println("Salário atual: R$" + salarioFuncionario);
      System.out.println("Novo salário: R$" + novoSalario);
    }

    scanner.close();
  }
}
