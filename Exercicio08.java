import java.util.Scanner;

public class Exercicio08 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Solicita o nome do aluno
    System.out.print("Digite o nome do aluno: ");
    String nomeAluno = scanner.nextLine();

    // Solicita e lê as três notas do aluno
    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();

    // Calcula a média aritmética
    double media = (nota1 + nota2 + nota3) / 3.0;

    // Exibe o nome do aluno e sua menção
    System.out.println("\nNome do aluno: " + nomeAluno);
    System.out.println("Média: " + media);

    // Verifica a menção do aluno
    if (media >= 7.0) {
      System.out.println("Menção: Aprovado");
    } else if (media <= 5.0) {
      System.out.println("Menção: Reprovado");
    } else {
      System.out.println("Menção: Recuperação");
    }

    scanner.close();
  }
}
