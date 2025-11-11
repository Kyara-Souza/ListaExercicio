import java.util.Scanner;

public class Questao7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite a quantidade de números (N >= 1): ");
            String entrada = scanner.nextLine();
            try {
                n = Integer.parseInt(entrada);
                if (n >= 1) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: o número deve ser maior ou igual a 1.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                String entrada = scanner.nextLine();
                try {
                    vetor[i] = Integer.parseInt(entrada);
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida. Digite um número inteiro.");
                }
            }
        }

        int x = 0;
        entradaValida = false;
        while (!entradaValida) {
            System.out.println();
            System.out.print("Digite o valor alvo x: ");
            String entrada = scanner.nextLine();
            try {
                x = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] == x) {
                contador++;
            }
        }

        System.out.println("O valor " + x + " ocorre " + contador + " vez(es) no vetor.");
        scanner.close();
    }

}
