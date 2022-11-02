package students.student_oskars_popens.lesson_3.level_7_senior;

class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House("430 Brivibas street, Riga", 1990, 230.5);
        myHouse.isHeating = false;
        myHouse.heatingCosts = 5.33;

        myHouse.printHouseInfo();

        System.out.println("=====================================");
        myHouse.setHeating(true);
        myHouse.printHouseInfo();

        System.out.println("=====================================");
        myHouse.setHeatingCosts(7.2);
        myHouse.printHouseInfo();

    }
}
