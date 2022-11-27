package teacher.lesson_8.lessoncode;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate hireDay;

    public Employee(String firstName, String lastName, double salary, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee() {
    }

    public boolean isMinimalWage(double salary) {
        return salary <= 600;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = salary * percent / 100;
        salary = salary + raiseAmount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " salary is " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
