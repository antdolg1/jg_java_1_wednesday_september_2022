package teacher.lesson_9.lessoncode;

public class CuttingMachine extends Machine{

    private String bladeType;

    public CuttingMachine(String engineType, int weight, String material, String purpose, boolean mobile, String bladeType) {
        super(engineType, weight, material, purpose, mobile);
        this.bladeType = bladeType;
    }

    @Override
    public void createMachine() {
        System.out.println("Cutting machine created!");
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public String toString() {
        return "CuttingMachine{" +
                "bladeType='" + bladeType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", purpose='" + purpose + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
