import java.util.Scanner;

public class Exercicio22 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Tipos de Cliente:");
    System.out.println("1 - Residência");
    System.out.println("2 - Comércio");
    System.out.println("3 - Indústria");
    System.out.print("Escolha o tipo de cliente (1/2/3): ");
    int tipoCliente = scanner.nextInt();

    System.out.print("Digite o consumo em KW/h: ");
    double consumoKWh = scanner.nextDouble();

    double valorKWh = 0.0;

    switch (tipoCliente) {
      case 1:
        valorKWh = 0.60;
        break;
      case 2:
        valorKWh = 0.48;
        break;
      case 3:
        valorKWh = 1.29;
        break;
      default:
        System.out.println("Tipo de cliente inválido!");
        break;
    }

    if (valorKWh > 0) {
      double valorConta = consumoKWh * valorKWh;
      System.out.printf("Valor da conta de luz: R$ %.2f%n", valorConta);
    }

    scanner.close();
  }
}
