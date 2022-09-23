package ValorPecas;

import java.util.Locale;
import java.util.Scanner;

public class main {
    /*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
        double valorUniPeca1, valorUniPeca2, valorPago;

        codigoPeca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorUniPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorUniPeca2 = sc.nextDouble();

        valorPago = valorUniPeca1 * numeroPeca1 + valorUniPeca2 * numeroPeca2;


        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        sc.close();
    }

}
