package CurrencyConverter;

public class CurrencyConverter {
    public double  valorDolar;
    public double  valorComprado;

    public CurrencyConverter (double valorDolar, double valorComprado) {
        this.valorDolar = valorDolar;
        this.valorComprado = valorComprado;
    }

    public double CalculaTotal(double valorDolar, double valorComprado) {
        return  (valorDolar * valorComprado) + ((valorDolar * valorComprado) * ((double)6 / 100));
    }
}
