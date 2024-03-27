/*1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);


Ao final do processamento, qual será o valor da variável SOMA?*/


public class SomaNumeros {
    public static void main(String[] args) {

        // Definindo as variáveis
        int INDICE = 13; // Valor limite para o loop
        int SOMA = 0; // Variável para armazenar a soma dos números
        int K = 0;  // Variável de controle do loop

        // Loop enquanto K for menor que INDICE
        while (K < INDICE) {
            K = K + 1; // Incrementa K em 1 a cada iteração
            SOMA = SOMA + K; // Acumula o valor de K na variável SOMA
        }
        // Imprime o valor da variável SOMA ao final do processamento
        System.out.println("O valor da variável SOMA é: " + SOMA);
        // Ao final do processamento, qual será o valor da variável SOMA?
        // O valor da variável SOMA é: 91
    }
}

