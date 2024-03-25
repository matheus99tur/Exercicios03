import java.util.Scanner;

public class Exercicio18 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do funcionário: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a idade do funcionário: ");
    int idade = scanner.nextInt();

    scanner.nextLine(); // Limpar o buffer

    System.out.print("Digite o sexo do funcionário (M/F): ");
    char sexo = scanner.nextLine().toUpperCase().charAt(0);

    System.out.print("Digite o salário fixo do funcionário: R$");
    double salarioFixo = scanner.nextDouble();

    double abono = 0;

    // Calculando o abono de acordo com o sexo e idade
    if (sexo == 'M') {
      if (idade >= 30) {
        abono = 100.0;
      } else {
        abono = 50.0;
      }
    } else if (sexo == 'F') {
      if (idade >= 30) {
        abono = 200.0;
      } else {
        abono = 80.0;
      }
    } else {
      System.out.println("Sexo inválido. Programa encerrado.");
      System.exit(0); // Encerra o programa
    }

    double salarioLiquido = salarioFixo + abono;

    System.out.println("\nNome do funcionário: " + nome);
    System.out.println("Salário líquido: R$" + salarioLiquido);

    scanner.close();
  }
}
