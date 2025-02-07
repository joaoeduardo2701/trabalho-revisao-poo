package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Double> scores = new ArrayList<>();

    public Student(String name, List<Double> scores)
    {
        this.name = name;
        this.scores = scores;
    }

    public double NotaFinal(){
        return scores.get(0) + scores.get(1) + scores.get(2);
    }

    public boolean Falhou(){
        if (NotaFinal() > 60.0)
            return false;

        return true;
    }

    public double PontosRestantes() {
        return 60 - NotaFinal();
    }
}
