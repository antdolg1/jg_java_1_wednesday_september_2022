package students.student_svetlana_seda.lesson_8.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Calendar {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String monthName = date.getMonth().name();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);//SET START OF THE MONTH

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();//1- Monday, 2 - Tuesday...
        System.out.println();
        System.out.println(monthName);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < value; i++) {
            System.out.print("    ");//DOBAVILI PROBELI I SDVINULI CIFRI
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());//% nado raspechatatj peremennuju, d - int; 3 oznachaet - mi dolzni ispoiljzovatj minimum 3 simvola shtobi otobrazitj eto chislo, nehvatajushij simvol zapolbjaem probelom

            if (date.getDayOfMonth() == today) {
                System.out.print("*");// today is Dec 5
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();// sverhu raskidivaem kazduuju nedelju:poluchaem denj nedelji i znachenije i esli eto znachenije ravno odnomu toestj ponedeljniku, to mi dobavljaem pustuju stroku i tak kak mi dobavili pustuju stroku to sled iperacija nachnetsja s novoj stroki
            }
        }

    }

}
