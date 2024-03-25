import java.util.Scanner;

public class Exercicio09 {
  public static void executar() {

    Scanner scanner = new Scanner(System.in);

    int contador = 0; // Variável para contar os números no intervalo

    System.out.println("Digite 80 números:");

    // Lê 80 números e verifica quantos estão no intervalo
    for (int i = 0; i < 80; i++) {
      int numero = scanner.nextInt();

      if (numero >= 10 && numero <= 150) {
        contador++;
      }
    }

    // Exibe o resultado da contagem
    System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);

    scanner.close();
  }
}
