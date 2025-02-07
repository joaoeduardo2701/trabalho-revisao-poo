package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String nome;
    public List<Double> notas = new ArrayList<>();

    public Student(String nome, List<Double> notas)
    {
        this.nome = nome;
        this.notas = notas;
    }

    public double NotaFinal(){
        return notas.get(0) + notas.get(1) + notas.get(2);
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
