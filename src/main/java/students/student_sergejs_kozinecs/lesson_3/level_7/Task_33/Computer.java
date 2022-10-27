package students.student_sergejs_kozinecs.lesson_3.level_7.Task_33;

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {
        return this.manufacturer;
    }

    String getModel() {
        return this.model;
    }
    
}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
