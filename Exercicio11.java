import java.util.Scanner;

public class Exercicio11 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int totalHomens = 0;
    int totalMulheres = 0;

    for (int i = 1; i <= 56; i++) {
      System.out.print("Digite o nome da pessoa " + i + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite o sexo da pessoa (M para homem, F para mulher): ");
      char sexo = scanner.next().charAt(0);
      scanner.nextLine(); // Limpar o buffer do scanner

      if (sexo == 'M' || sexo == 'm') {
        System.out.println(nome + " é homem.");
        totalHomens++;
      } else if (sexo == 'F' || sexo == 'f') {
        System.out.println(nome + " é mulher.");
        totalMulheres++;
      } else {
        System.out.println("Opção inválida. Digite M para homem ou F para mulher.");
        i--; // Repetir o laço para a mesma pessoa
      }
    }

    System.out.println("\nTotal de homens: " + totalHomens);
    System.out.println("Total de mulheres: " + totalMulheres);

    scanner.close();
  }
}
