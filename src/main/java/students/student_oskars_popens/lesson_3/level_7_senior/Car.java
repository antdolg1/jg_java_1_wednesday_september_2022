package students.student_oskars_popens.lesson_3.level_7_senior;

class Car {
    String model;
    String regNumber;
    String fuel;
    boolean isWinterTyre;
    boolean isTA;

    Car() {

    }

    Car(String model, String regNumber, String fuel) {
        this.model = model;
        this.regNumber = regNumber;
        this.fuel = fuel;
    }

    void setWinterTyre() {
        this.isWinterTyre = true;
    }

    void setSummerTyre() {
        this.isWinterTyre = false;
    }

    void changeTyre() {
        if (this.isWinterTyre) {
            setSummerTyre();
        } else {
            setWinterTyre();
        }
    }

    void printCarStatus() {
        System.out.printf("Car %s with reg.number %s:\n", this.model, this.regNumber);
        System.out.println("Fuel type:" + this.fuel);
        System.out.println("Tyres:" + (this.isWinterTyre ? "Winter" : "Summer") + " tyres");
        System.out.println("Technical condition:" + (this.isTA ? "OK" : "Not OK"));
    }

    void approveTA() {
        this.isTA = true;
    }
}
