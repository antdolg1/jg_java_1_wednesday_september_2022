package students.student_oskars_popens.lesson_3.level_7_senior;

class House {
    String address;
    int year;
    double area;
    boolean isHeating;
    double heatingCosts;

    House(String address, int year, double area) {
        this.address = address;
        this.year = year;
        this.area = area;
    }

    void setHeating(boolean heating) {
        isHeating = heating;
    }

    void setHeatingCosts(double heatingCosts) {
        this.heatingCosts = heatingCosts;
    }

    void printHouseInfo() {
        System.out.println("House address: " + this.address);
        System.out.println("The year the house was built: " + this.year);
        System.out.println("Area of the house: " + this.area);
        System.out.printf("Heating is turned: %s \n", (this.isHeating ? "On" : "Off"));

        if (isHeating) {
            System.out.println("Hearting costs (EUR/m3): " + this.heatingCosts);
            System.out.printf("House heating costs: %.2f EUR\n", this.area * this.heatingCosts);
        }
    }
}
