package students.student_oskars_popens.lesson_4.level_6_middle;

class Stock {
    String companyName;
    double currentValue;
    double minValue;
    double maxValue;

    Stock() {
    }

    ;

    Stock(String companyName, double currentValue) {
        this.companyName = companyName;
        this.minValue = this.maxValue = this.currentValue = currentValue;
    }

    void updatePrice(double newValue) {
        if (this.maxValue < newValue) {
            this.maxValue = newValue;
        }
        if (this.minValue > newValue) {
            this.minValue = newValue;
        }
        this.currentValue = newValue;
    }

    String getPriceInformation(){
        return "Company: " + this.companyName +
                ", Current price: " + this.currentValue +
                ", Min price: " + this.minValue +
                ", Max price: " + this.maxValue;
    }
}
