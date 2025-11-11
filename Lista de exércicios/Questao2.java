import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        String operador = "";
        boolean entradaValida = false;

        
        while (!entradaValida) {
            System.out.print("Digite o primeiro número: ");
            String entrada = scanner.nextLine();
            try {
                num1 = Double.parseDouble(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número válido.");
            }
        }

        entradaValida = false;

        
        while (!entradaValida) {
            System.out.print("Digite o segundo número: ");
            String entrada = scanner.nextLine();
            try {
                num2 = Double.parseDouble(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número válido.");
            }
        }

        
        boolean operacaoValida = false;
        while (!operacaoValida) {
            System.out.print("Digite a operação (+, -, *, /): ");
            operador = scanner.nextLine();

            switch (operador) {
                case "+":
                    System.out.printf("Resultado: %.2f%n", (num1 + num2));
                    operacaoValida = true;
                    break;
                case "-":
                    System.out.printf("Resultado: %.2f%n", (num1 - num2));
                    operacaoValida = true;
                    break;
                case "*":
                    System.out.printf("Resultado: %.2f%n", (num1 * num2));
                    operacaoValida = true;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        System.out.printf("Resultado: %.2f%n", (num1 / num2));
                    }
                    operacaoValida = true;
                    break;
                default:
                    System.out.println("Erro: operação inválida. Use apenas +, -, * ou /.");
            }
        }

        scanner.close();
    }

}
