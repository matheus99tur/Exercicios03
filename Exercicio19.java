import java.util.Scanner;

public class Exercicio19 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite os três lados do triângulo:");
    System.out.print("Lado 1: ");
    int lado1 = scanner.nextInt();
    System.out.print("Lado 2: ");
    int lado2 = scanner.nextInt();
    System.out.print("Lado 3: ");
    int lado3 = scanner.nextInt();

    if (verificarTriangulo(lado1, lado2, lado3)) {
      System.out.println("Os valores informados podem ser os lados de um triângulo.");

      if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("Triângulo Equilátero");
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("Triângulo Isóscele");
      } else {
        System.out.println("Triângulo Escaleno");
      }
    } else {
      System.out.println("Os valores informados não podem ser os lados de um triângulo.");
    }

    scanner.close();
  }

  public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
    return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
  }
}
