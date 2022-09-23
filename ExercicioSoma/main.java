package ExercicioSoma;

import java.util.Scanner;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("SOMA: "+ resultado);

        sc.close();

    }
}
