import java.util.Scanner;

public class Exercicio10 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão verificadas? ");
    int quantidadePessoas = scanner.nextInt();

    for (int i = 1; i <= quantidadePessoas; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      int idade = scanner.nextInt();

      // Verifica se a pessoa é maior ou menor de idade
      if (idade >= 18) {
        System.out.println("Maior de idade");
      } else {
        System.out.println("Menor de idade");
      }
    }
    scanner.close();
  }
}
