package students.student_konstantin_karetnikov.lesson_3.level_7;

class Plane {
    String company;
    String model;
    int age;

    void route() {
        System.out.println(model + " of " + company + " company flew from New York to Chicago and back then it was " + age + " years old");
    }

    void route2() {
        System.out.println("Now the " + model + " owned by " + company + " and flying from Riga to Tallinn and back.");
    }

    void aging() {
        age += 10;
        System.out.println("Ten years later...");
    }


    void changeCompany(String newCompany) {
        company = newCompany;
        System.out.println("Aircraft sold to another company");
    }
}

