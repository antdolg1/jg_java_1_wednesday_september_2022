package students.student_konstantin_karetnikov.lesson_3.level_7;

class TrafficLight {

    String colorRed;
    String colorYellow;
    String colorGreen;


    void redPedestrians(String colorRed) {
        System.out.println(" Now lighting " + colorRed + " for pedestrians, " + colorGreen + " for vehicles. Vehicles can drive, pedestrians must wait. ");
    }

    void yellowAll(String colorYellow) {
        System.out.println(" Now lighting " + colorYellow + " for pedestrians and " + colorYellow + " for vehicles. All must be wait. ");
    }

    void greenPedestrians(String colorGreen) {
        System.out.println(" Now lighting " + colorGreen + " for pedestrians, " + colorRed + " for vehicles. Pedestrians can go, vehicles must wait.");
    }
}

