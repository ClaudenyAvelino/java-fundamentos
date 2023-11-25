package primeiroprojeto;

import java.util.Scanner;

public class AraCircunferencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o raio");
        double raio = in.nextDouble();
        final double pi = 3.14159;
        double area = pi*raio*raio;
        System.out.println("Área ="+area);

    }
}
