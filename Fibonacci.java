import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o número a ser verificado
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Fechando o Scanner após a leitura
        scanner.close();

        // Calculando a sequência de Fibonacci até o número ser maior ou igual ao número a ser verificado
        int a = 0;
        int b = 1;
        int fib = a + b;

        // Verificando se o número pertence à sequência
        while (fib < numero) {
            a = b;
            b = fib;
            fib = a + b;
        }

        // Verificando se o número pertence ou não à sequência de Fibonacci
        if (fib == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

