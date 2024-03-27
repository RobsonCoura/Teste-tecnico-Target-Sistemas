import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira a string a ser invertida
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        // Fechando o Scanner após a leitura
        scanner.close();

        // Convertendo a string para um array de caracteres
        char[] caracteres = input.toCharArray();

        // Invertendo os caracteres
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - i - 1];
            caracteres[tamanho - i - 1] = temp;
        }

        // Construindo a string invertida a partir do array de caracteres
        String invertida = new String(caracteres);

        // Imprimindo a string invertida
        System.out.println("String invertida: " + invertida);
    }
}
