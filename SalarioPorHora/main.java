package SalarioPorHora;

import java.util.Locale;
import java.util.Scanner;

public class main {
    /*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero,horas;
        double valorHoras,salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHoras = sc.nextDouble();

        salario = valorHoras * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY US$ %.2f%n", salario);

        sc.close();
    }

}
