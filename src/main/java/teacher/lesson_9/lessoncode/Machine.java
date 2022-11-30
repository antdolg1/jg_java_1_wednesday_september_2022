package teacher.lesson_9.lessoncode;

public class Machine extends Object{

    protected String engineType;
    protected int weight;
    protected String material;
    protected String purpose;
    protected boolean mobile;

    public Machine(String engineType, int weight, String material, String purpose, boolean mobile) {
        this.engineType = engineType;
        this.weight = weight;
        this.material = material;
        this.purpose = purpose;
        this.mobile = mobile;
    }

    public Machine() {
    }

    public void createMachine() {
        System.out.println("Machine created!");
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "engineType='" + engineType + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", purpose='" + purpose + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
