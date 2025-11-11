import java.util.Scanner;

public class Questao6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        
        while (!entradaValida) {
            System.out.print("Digite a quantidade de números (entre 1 e 100): ");
            String entrada = scanner.nextLine();
            try {
                n = Integer.parseInt(entrada);
                if (n >= 1 && n <= 100) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: o número deve estar entre 1 e 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        double[] numeros = new double[n];
        double soma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                String entrada = scanner.nextLine();
                try {
                    numeros[i] = Double.parseDouble(entrada);
                    soma += numeros[i];
                    if (numeros[i] < min) min = numeros[i];
                    if (numeros[i] > max) max = numeros[i];
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida. Digite um número decimal.");
                }
            }
        }

        double media = soma / n;
        
        System.out.println();
        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Mínimo: %.2f%n", min);
        System.out.printf("Máximo: %.2f%n", max);

        scanner.close();
    }

}
