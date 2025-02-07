package CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Qual o valor do dólar? ");
        double valorDolar = sc.nextDouble();

        System.out.print("Quantos dólares serão coprados? ");
        double valorComprado = sc.nextDouble();

        CurrencyConverter c = new CurrencyConverter(valorDolar, valorComprado);

        System.out.printf("Valor a ser pago em reais = %.2f\n",  c.CalculaTotal(valorDolar, valorComprado));
    }
}
