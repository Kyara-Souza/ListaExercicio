import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o primeiro número: ");
            String entrada = scanner.nextLine();
            try {
                a = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o segundo número: ");
            String entrada = scanner.nextLine();
            try {
                b = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o terceiro número: ");
            String entrada = scanner.nextLine();
            try {
                c = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        int maior = max3(a, b, c);
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }

    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

}
