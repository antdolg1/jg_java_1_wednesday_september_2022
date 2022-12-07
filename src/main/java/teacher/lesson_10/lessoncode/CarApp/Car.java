package teacher.lesson_10.lessoncode.CarApp;

public abstract class Car {

    private String model;
    private int power;

    public abstract void start();

    public abstract void stop();

    public abstract boolean updateSystem();

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
