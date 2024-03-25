import java.util.Scanner;

public class Exercicio20 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha o nível do professor:");
    System.out.println("1 - Professor Nível 1 (R$12,00 por hora/aula)");
    System.out.println("2 - Professor Nível 2 (R$17,00 por hora/aula)");
    System.out.println("3 - Professor Nível 3 (R$25,00 por hora/aula)");
    int nivel = scanner.nextInt();

    System.out.print("Digite a quantidade de horas/aula trabalhadas: ");
    int horasAula = scanner.nextInt();

    double valorHoraAula = 0.0;

    switch (nivel) {
      case 1:
        valorHoraAula = 12.0;
        break;
      case 2:
        valorHoraAula = 17.0;
        break;
      case 3:
        valorHoraAula = 25.0;
        break;
      default:
        System.out.println("Nível inválido.");
        System.exit(0); // Encerra o programa
    }

    double salario = valorHoraAula * horasAula;
    System.out.println("O salário do professor é: R$" + salario);

    scanner.close();
  }
}
