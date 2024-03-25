import java.util.Scanner;

public class Exercicio01 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
    String nomeAluno = scanner.nextLine();

    System.out.print("Digite a nota da primeira prova: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a nota da segunda prova: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a nota da terceira prova: ");
    double nota3 = scanner.nextDouble();

    // Calcular a média das notas
    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("\nNome do aluno: " + nomeAluno);
    System.out.println("Média das notas: " + media);

    scanner.close();
  }
}
