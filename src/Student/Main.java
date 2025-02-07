package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome = sc.nextLine();

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        List<Double> scores = new ArrayList<>();

        scores.add(nota1);
        scores.add(nota2);
        scores.add(nota3);

        Student student = new Student(nome, scores);

        System.out.printf("NOTA FINAL = %.2f\n", student.NotaFinal());

        if (student.Falhou()){
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS\n", student.PontosRestantes());
        } else {
            System.out.println("PASS");
        }
    }
}
