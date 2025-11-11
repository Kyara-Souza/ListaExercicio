import java.util.Scanner;
import java.util.Arrays;

public class Questao8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite a quantidade de elementos (N >= 1): ");
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
                System.out.print("Digite o elemento " + (i + 1) + ": ");
                String entrada = scanner.nextLine();
                try {
                    vetor[i] = Integer.parseInt(entrada);
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida. Digite um número inteiro.");
                }
            }
        }
        
        System.out.println();
        System.out.println("Vetor antes da ordenação: " + Arrays.toString(vetor));

        selectionSort(vetor);

        System.out.println("Vetor após a ordenação: " + Arrays.toString(vetor));

        scanner.close();
    }

    public static void selectionSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            int temp = v[i];
            v[i] = v[indiceMenor];
            v[indiceMenor] = temp;
        }
    }


}
