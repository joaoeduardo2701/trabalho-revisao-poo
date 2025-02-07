package Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Configura para aceitar números com "."

        System.out.println("Entre com a largura e altura do retângulo: ");

        double largura = sc.nextDouble();

        double altura = sc.nextDouble();

        Rectangle rectangle = new Rectangle(largura, altura);

        System.out.println("AREA = " + rectangle.Area(largura, altura));
        System.out.println("PERIMETRO = " + rectangle.Perimeter(largura, altura));
        System.out.println("DIAGONAL = " + rectangle.Diagonal(largura, altura));
    }
}
