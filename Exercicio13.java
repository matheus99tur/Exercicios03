import java.util.Scanner;

public class Exercicio13 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int totalPessoas = 0;
    int totalAptos = 0;
    int totalNaoAptos = 0;

    System.out.print("Digite a quantidade de pessoas (N): ");
    int n = scanner.nextInt();
    scanner.nextLine(); // Consumir a quebra de linha

    for (int i = 1; i <= n; i++) {
      System.out.println("\nDigite os dados da pessoa " + i + ":");
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Sexo (M/F): ");
      char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));

      System.out.print("Idade: ");
      int idade = scanner.nextInt();

      System.out.print("Saúde (Boa/B/Bom/Regular/Ruim): ");
      String saude = scanner.next();
      scanner.nextLine(); // Consumir a quebra de linha

      // Verificar aptidão para o serviço militar
      boolean apto = (sexo == 'M' && idade >= 18 && idade <= 30
          && (saude.equalsIgnoreCase("Boa") || saude.equalsIgnoreCase("B") || saude.equalsIgnoreCase("Bom")));

      if (apto) {
        System.out.println(nome + " está APTO para o serviço militar obrigatório.");
        totalAptos++;
      } else {
        System.out.println(nome + " NÃO está apto para o serviço militar obrigatório.");
        totalNaoAptos++;
      }

      totalPessoas++;
    }

    System.out.println("\nTotal de pessoas avaliadas: " + totalPessoas);
    System.out.println("Total de pessoas APTAS: " + totalAptos);
    System.out.println("Total de pessoas NÃO APTAS: " + totalNaoAptos);

    scanner.close();
  }
}
