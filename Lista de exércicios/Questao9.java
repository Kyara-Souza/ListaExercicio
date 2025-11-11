import java.util.Scanner;
import java.util.Arrays;

public class Questao9 {

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
        
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        int x = 0;
        entradaValida = false;
        while (!entradaValida) {
            System.out.print("Digite o valor a ser buscado: ");
            String entrada = scanner.nextLine();
            try {
                x = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }
        
        int indice = buscaBinaria(vetor, x);

        if (indice != -1) {
            System.out.println("O valor " + x + " foi encontrado na posição " + indice + ".");
        } else {
            System.out.println("O valor " + x + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    public static int buscaBinaria(int[] v, int x) {
        int ini = 0;
        int fim = v.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;

            if (v[meio] == x) {
                return meio;
            } else if (x < v[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1; 
    }

}
