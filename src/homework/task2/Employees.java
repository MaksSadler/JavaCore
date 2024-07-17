package homework.task2;

import java.time.LocalDate;
import java.util.Comparator;

public class Employees {
    private String firstName;
    private String surname;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private double salary;

    public Employees(String firstName, String surname, String lastName,
                     LocalDate birthDate, String position, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static Comparator<Employees> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }
}
