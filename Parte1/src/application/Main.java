package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("Valor de PI: %.2f\n", PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return PI * 2.0 * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }
}

