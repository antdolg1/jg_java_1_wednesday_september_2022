package students.student_vladislav_saksin.lesson3.level7;

class Boxer {

    String name;
    int age;
    int weight;
    String stance;


    Boxer(String name, int age, int weight, String stance) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.stance = stance;


    }


    void combo1() {
        System.out.println(name + " hits: jab jab - opponent is slightly damaged");

    }

    void combo2() {
        System.out.println(name + " hits: jab cross jab - opponent feels worse");
    }

    void combo3() {
        System.out.println(name + " hits: jab cross left hook - opponent has a problem");

    }

    void combo4() {
        System.out.println(name + " hits: left hook right hook uppercut - its a Knockdown, baby!");

            }

    void combo5() {
        System.out.println(name + " hits: jab cross left hook right hook liver hit head uppercut - Good night, darling. Knockout.");

    }

}

