import java.util.Scanner;

public class Exercicio24 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculadora de Nota Final do Estudante");
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

    System.out.printf("A nota final do estudante é: %.2f%n", notaFinal);

    scanner.close();
  }
}
