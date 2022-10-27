import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("\n*****************");
    System.out.println("Programa de aluno");
    System.out.println("*****************\n");

    System.out.println("Quantidade de alunos: ");
    Scanner input = new Scanner (System.in);
    int tamanho;
    tamanho = input.nextInt();
    int[] notas = new int[tamanho];
    System.out.println("Informe cada uma das notas:");
     for (int i = 0; i < notas.length; i++) {
         notas[i] = input.nextInt();
     }
    
    double media = calcMedia(notas);
    double maiorNota = maiorNota(notas);
    double menorNota = menorNota(notas);
     System.out.println("A média é: " + media);
    System.out.println("A maior é: " + maiorNota);
    System.out.println("A menor é: " + menorNota);
  }
  public static double calcMedia(int[] notas) {
     double soma= 0;
     for (int i = 0; i < notas.length; i++) {
         soma = soma + notas[i];
     }
     double media = soma / notas.length;
     return media;
  }

   public static int maiorNota (int[] notas) {
    int limit = notas[0];
    for( int voltas = 0; voltas < notas.length; voltas++) {
      if(notas[voltas] > limit) {
        limit = notas[voltas];
      }
    }
    return limit;
  }

  public static int menorNota (int[] notas ) {
    int limit = notas[0];
    for( int voltas = 0; voltas < notas.length; voltas++) {
      if(notas[voltas] <= limit) {
        limit = notas [voltas];
      }
    }
    return limit;
  }

}