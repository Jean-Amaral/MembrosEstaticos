package application;

import util.Convercao;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do dolar: ");
        double dollar = sc.nextDouble();
        System.out.println("Entre com a quantidade da compra: ");
        double quanttdd = sc.nextDouble();

        System.out.printf("Valor total comprado: %.2f\n", Convercao.totalComprado(dollar, quanttdd));

        sc.close();

    }
}
