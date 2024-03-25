import java.util.Scanner;

public class Exercicio26 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Determinação da Categoria de Seguro");
    System.out.print("Digite o nome do pretendente: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a idade do pretendente: ");
    int idade = scanner.nextInt();

    System.out.print("Digite o grupo de risco do pretendente (1 a 9): ");
    int grupoRisco = scanner.nextInt();

    // Verifica se a idade está na faixa necessária
    if (idade < 17 || idade > 70) {
      System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
    } else {
      int categoria;
      if (idade >= 17 && idade <= 20) {
        categoria = grupoRisco;
      } else if (idade >= 21 && idade <= 24) {
        categoria = grupoRisco + 1;
      } else if (idade >= 25 && idade <= 34) {
        categoria = grupoRisco + 2;
      } else if (idade >= 35 && idade <= 64) {
        categoria = grupoRisco + 3;
      } else {
        categoria = grupoRisco + 6;
      }

      System.out.println("\nDados do Pretendente:");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Grupo de Risco: " + grupoRisco);
      System.out.println("Categoria de Seguro: " + categoria);
    }

    scanner.close();
  }
}
