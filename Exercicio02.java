import java.util.Scanner;

public class Exercicio02 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a distância total percorrida (em km): ");
    double distanciaTotal = scanner.nextDouble();

    System.out.print("Digite o total de combustível gasto (em litros): ");
    double combustivelGasto = scanner.nextDouble();

    // Calcular o consumo médio
    double consumoMedio = distanciaTotal / combustivelGasto;

    System.out.println("\nConsumo médio do automóvel: " + consumoMedio + " km/l");

    scanner.close();
  }
}
