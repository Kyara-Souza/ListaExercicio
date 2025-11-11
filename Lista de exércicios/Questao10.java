import java.util.ArrayList;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int opcao = -1;

        do {
            System.out.println("\nMenu:");
            System.out.println("(1) Inserir número na lista");
            System.out.println("(2) Listar números");
            System.out.println("(3) Somar números");
            System.out.println("(4) Limpar lista");
            System.out.println("(0) Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = scanner.nextLine();
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Erro: opção inválida. Digite um número entre 0 e 4.");
                continue;
            }

            switch (opcao) {
                case 1:
                    inserir(scanner, lista);
                    break;
                case 2:
                    listar(lista);
                    break;
                case 3:
                    somar(lista);
                    break;
                case 4:
                    limpar(lista);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Erro: opção inválida. Digite um número entre 0 e 4.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void inserir(Scanner scanner, ArrayList<Integer> lista) {
        System.out.print("Digite um número inteiro para adicionar à lista: ");
        String entrada = scanner.nextLine();
        try {
            int numero = Integer.parseInt(entrada);
            lista.add(numero);
            System.out.println("Número adicionado com sucesso.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida. Digite um número inteiro.");
        }
    }

    public static void listar(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Números na lista: " + lista);
        }
    }

    public static void somar(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia. Soma = 0.");
        } else {
            int soma = 0;
            for (int num : lista) {
                soma += num;
            }
            System.out.println("Soma dos números: " + soma);
        }
    }

    public static void limpar(ArrayList<Integer> lista) {
        lista.clear();
        System.out.println("Lista limpa com sucesso.");
    }
}