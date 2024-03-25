import java.util.Scanner;

public class Exercicio21 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a idade do nadador: ");
    int idade = scanner.nextInt();

    String categoria = "";

    if (idade >= 5 && idade <= 7) {
      categoria = "Infantil A";
    } else if (idade >= 8 && idade <= 10) {
      categoria = "Infantil B";
    } else if (idade >= 11 && idade <= 13) {
      categoria = "Juvenil A";
    } else if (idade >= 14 && idade <= 17) {
      categoria = "Juvenil B";
    } else if (idade >= 18 && idade <= 25) {
      categoria = "Sênior";
    } else {
      categoria = "Idade fora da faixa etária";
    }

    System.out.println("O nadador está na categoria: " + categoria);

    scanner.close();
  }
}
