package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String name = sc.nextLine();

        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        List<Double> scores = new ArrayList<>();

        scores.add(score1);
        scores.add(score2);
        scores.add(score3);

        Student student = new Student(name, scores);

        System.out.printf("NOTA FINAL = %.2f\n", student.NotaFinal());

        if (student.Falhou()){
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS\n", student.PontosRestantes());
        } else {
            System.out.println("PASS");
        }
    }
}
