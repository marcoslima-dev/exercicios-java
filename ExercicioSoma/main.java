package ExercicioSoma;

import java.util.Scanner;

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
