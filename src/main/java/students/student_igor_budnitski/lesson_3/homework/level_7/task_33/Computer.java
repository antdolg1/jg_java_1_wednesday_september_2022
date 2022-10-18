package students.student_igor_budnitski.lesson_3.homework.level_7.task_33;
/*
* Missing Gettter for manufacturer & model
*
* */
class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
