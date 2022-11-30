package teacher.lesson_9.lessoncode;

public abstract class Car {

    private String model;

    public abstract void start();

    public abstract void stop();

    public abstract boolean updateSystem();

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
