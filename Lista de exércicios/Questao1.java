import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um número inteiro: ");
            String entrada = scanner.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                entradaValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        scanner.close();
    }

}


