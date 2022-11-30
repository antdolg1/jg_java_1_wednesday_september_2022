package teacher.lesson_9.lessoncode;

public class HighPressureWashingMachine extends WashingMachine{

    private int pressure;

    public HighPressureWashingMachine(String engineType, int weight, String material, String purpose, boolean mobile, int volume, String brand, int pressure) {
        super(engineType, weight, material, purpose, mobile, volume, brand);
        this.pressure = pressure;
    }

    @Override
    public void createMachine() {
        System.out.println("High pressure washing machine created!");
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
