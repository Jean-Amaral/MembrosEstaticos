package util;

public class Convercao {

    public static final double TAXA_IOF = 0.06;

    public static double totalImposto(double dollar, double quanttdd) {
        return (dollar * quanttdd) * TAXA_IOF;
    }

    public static double totalComprado(double dollar, double quanttdd) {
        return (dollar * quanttdd) + totalImposto(dollar, quanttdd);
    }

}