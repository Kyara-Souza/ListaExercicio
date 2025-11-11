import java.util.Scanner;

public class Questao4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um número inteiro entre 0 e 20: ");
            String entrada = scanner.nextLine();
            try {
                n = Integer.parseInt(entrada);
                if (n >= 0 && n <= 20) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: o número deve estar entre 0 e 20.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);
        scanner.close();
    }

}
