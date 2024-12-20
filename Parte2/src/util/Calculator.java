package util;

public class Calculator {

    public final double PI = 3.14159;

    public double circunferencia(double raio) {
        return PI * 2.0 * raio;
    }

    public double volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }
}
