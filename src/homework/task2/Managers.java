package homework.task2;

import java.time.LocalDate;

public class Managers extends Employees{

    public Managers(String firstName, String surname, String lastName,
                    LocalDate birthDate, String position, double salary) {
        super(firstName, surname, lastName, birthDate, position, salary);
    }

    public static void increaseSalary(Employees[] employees, double percentage) {
        for (Employees employee : employees) {
            if(!(employee instanceof Managers)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(Math.round(newSalary));
            }
        }
    }
}
