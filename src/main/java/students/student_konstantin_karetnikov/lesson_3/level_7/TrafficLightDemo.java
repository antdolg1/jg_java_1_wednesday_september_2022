package students.student_konstantin_karetnikov.lesson_3.level_7;


class TrafficLightDemo {

    public static void main(String[] args) {
     TrafficLight TrafficLight = new TrafficLight();
        TrafficLight.colorRed = "RED";
        TrafficLight.colorYellow = "YELLOW";
        TrafficLight.colorGreen = "GREEN";

        TrafficLight.redPedestrians("RED");
        TrafficLight.yellowAll("YELLOW");
        TrafficLight.greenPedestrians("GREEN");
    }

}
