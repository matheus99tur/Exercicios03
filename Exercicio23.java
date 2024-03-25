import java.util.Scanner;

public class Exercicio23 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome da pessoa: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o sexo da pessoa (M/F): ");
    char sexo = scanner.next().charAt(0);

    System.out.print("Digite a altura da pessoa (em metros): ");
    double altura = scanner.nextDouble();

    System.out.print("Digite a idade da pessoa: ");
    int idade = scanner.nextInt();

    double pesoIdeal = 0.0;

    if (sexo == 'M') {
      if (altura > 1.70) {
        if (idade <= 20) {
          pesoIdeal = (72.7 * altura) - 58;
        } else if (idade >= 21 && idade <= 39) {
          pesoIdeal = (72.7 * altura) - 53;
        } else {
          pesoIdeal = (72.7 * altura) - 45;
        }
      } else {
        pesoIdeal = (72.7 * altura) - 50;
      }
    } else if (sexo == 'F') {
      if (altura > 1.50) {
        if (idade >= 35) {
          pesoIdeal = (62.1 * altura) - 44.7;
        } else {
          pesoIdeal = (62.1 * altura) - 45;
        }
      } else {
        pesoIdeal = (62.1 * altura) - 49;
      }
    } else {
      System.out.println("Sexo inválido!");
    }

    if (pesoIdeal > 0) {
      System.out.println("Nome: " + nome);
      System.out.printf("Peso Ideal: %.2f kg%n", pesoIdeal);
    }

    scanner.close();
  }
}
