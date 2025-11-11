import java.util.Scanner;

public class Questao5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        
        while (!entradaValida) {
            System.out.print("Digite a quantidade de termos da sequência de Fibonacci (n >= 1): ");
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

        System.out.println("Sequência de Fibonacci (" + n + " termos):");

        int contador = 0;
        long a = 0, b = 1;

        while (contador < n) {
            System.out.print(a + " ");
            long proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }

        System.out.println(); 
        scanner.close();
    }

}
