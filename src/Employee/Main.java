package Employee;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Employee employee = new Employee(nome, salarioBruto, imposto);

        System.out.println("Funcionário: " + employee.getName() + ", $ " + employee.NetSalary());

        System.out.print("Qual a porcentagem para aumentar o salário? ");

        double percentage = sc.nextDouble();

        employee.IncreaseSalary(percentage);

        System.out.printf("Dados atualizados: %s, $ %.2f\n", employee.getName(), employee.getGrossSalary());
    }
}
