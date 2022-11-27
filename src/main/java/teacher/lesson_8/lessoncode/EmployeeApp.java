package teacher.lesson_8.lessoncode;

import java.time.LocalDate;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Vasja", "Pupkin", 1000.0, 23, 11, 2022);
        Employee employee2 = new Employee("Regina", "Ivanova", 500.0, 22, 11, 2022);
        Employee employee3 = new Employee();
        employee3.setFirstName("Zinaida");
        employee3.setLastName("Petrova");
        employee3.setSalary(2000.0);
        employee3.setHireDay(LocalDate.now());

        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

//        System.out.println(employee3);

        printEmployeesInfo(employees);
        System.out.println();
        System.out.println("employee1 hire day was: " + employee1.getHireDay());
        System.out.println("employee1 hire year was: " + employee1.getHireDay().getYear());
        System.out.println("employee1 hire month was: " + employee1.getHireDay().getMonth());
        System.out.println("employee1 hire day was: " + employee1.getHireDay().getDayOfMonth());
        System.out.println("employee1 hire day of the year was: " + employee1.getHireDay().getDayOfYear());
        System.out.println("employee1 hire day of the week was: " + employee1.getHireDay().getDayOfWeek());
        System.out.println();
        System.out.println(employee2.getHireDay());
        employee2.setHireDay(employee2.getHireDay().minusDays(2));
        System.out.println(employee2.getHireDay());
        employee2.setHireDay(employee2.getHireDay().plusWeeks(3));
        System.out.println(employee2.getHireDay());
        System.out.println("____________");
        System.out.println(employee1);
        employee1.raiseSalary(20.0);
        System.out.println(employee1);
        System.out.println("____________");
        System.out.println(employee2);
        if (employee2.isMinimalWage(employee2.getSalary())) {
            employee2.raiseSalary(60.0);
        }
        System.out.println(employee2);
    }

    private static void printEmployeesInfo(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
