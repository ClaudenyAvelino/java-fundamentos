package testeAprendizado;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius:");
        double temperatura = entrada.nextDouble();

        double conversaoEmFahrenheit = (temperatura * 1.8) + 32;
        int conversaoEmFahrenheitInteiro = (int) conversaoEmFahrenheit;

        System.out.println("A temperatura em Fahrenheit é "+conversaoEmFahrenheit);
        System.out.println("A temperatura em Fahrenheit é "+conversaoEmFahrenheitInteiro);


    }
}
