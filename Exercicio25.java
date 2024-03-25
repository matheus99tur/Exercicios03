import java.util.Scanner;

public class Exercicio25 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculadora de Nota Final e Classificação do Estudante");
    System.out.print("Digite o nome do estudante: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o número de matrícula do estudante: ");
    int matricula = scanner.nextInt();

    System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
    double lab = scanner.nextDouble();

    System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
    double avaliacao = scanner.nextDouble();

    System.out.print("Digite a nota do exame final (0 a 10): ");
    double exameFinal = scanner.nextDouble();

    // Pesos das notas
    double pesoLab = 2.0;
    double pesoAvaliacao = 3.0;
    double pesoExameFinal = 5.0;

    // Cálculo da nota final ponderada
    double notaFinal = (lab * pesoLab + avaliacao * pesoAvaliacao + exameFinal * pesoExameFinal)
        / (pesoLab + pesoAvaliacao + pesoExameFinal);

    // Determinar a classificação
    String classificacao;
    if (notaFinal >= 8) {
      classificacao = "A";
    } else if (notaFinal >= 7) {
      classificacao = "B";
    } else if (notaFinal >= 6) {
      classificacao = "C";
    } else if (notaFinal >= 5) {
      classificacao = "D";
    } else {
      classificacao = "R";
    }

    // Exibir os resultados
    System.out.println("\nInformações do Estudante:");
    System.out.println("Nome: " + nome);
    System.out.println("Número de Matrícula: " + matricula);
    System.out.printf("Nota Final: %.2f%n", notaFinal);
    System.out.println("Classificação: " + classificacao);

    scanner.close();
  }
}
