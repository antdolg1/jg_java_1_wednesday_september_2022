package students.student_oskars_popens.lesson_3.level_7_senior;

class CarDemo {
    public static void main(String[] args) {
        Car myCar1 = new Car();

        myCar1.model = "SAAB 9-5";
        myCar1.regNumber = "XX999";
        myCar1.fuel = "DD";
        myCar1.isWinterTyre = false;
        myCar1.isTA = true;

        Car myCar2 = new Car("BMW", "DD9922", "super 98");
        myCar2.setWinterTyre();
        myCar2.isTA = false;

        myCar1.printCarStatus();
        System.out.println("=================================================\n");
        myCar2.printCarStatus();

        System.out.println("=================================================\n");
        myCar1.changeTyre();

        myCar2.approveTA();
        myCar2.changeTyre();

        myCar1.printCarStatus();
        System.out.println("=================================================\n");
        myCar2.printCarStatus();
    }
}
