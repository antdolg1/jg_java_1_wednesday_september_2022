package students.student_oskars_popens.lesson_3.level_7_senior;

class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){
        return this.manufacturer;
    }

    String getModel(){
        return this.model;
    }
}
