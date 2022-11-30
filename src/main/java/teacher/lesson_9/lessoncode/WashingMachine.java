package teacher.lesson_9.lessoncode;

public class WashingMachine extends Machine{

    private int volume;
    private String brand;

    public WashingMachine(String engineType, int weight, String material, String purpose, boolean mobile, int volume, String brand) {
        super(engineType, weight, material, purpose, mobile);
        this.volume = volume;
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "volume=" + volume +
                ", brand='" + brand + '\'' +
                ", engineType='" + engineType + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", purpose='" + purpose + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
