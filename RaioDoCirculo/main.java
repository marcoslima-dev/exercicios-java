package RaioDoCirculo;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio,2);

        System.out.printf("A: %.4f%n", area);

        sc.close();
    }

}
