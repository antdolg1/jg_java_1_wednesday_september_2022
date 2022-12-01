package teacher.lesson_9.lessoncode;

public class MachineApp {

    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.engineType = "Electrical";
        machine.material = "Metal";
        machine.mobile = false;
        machine.purpose = "Not defined";
        machine.weight = 0;

        machine.createMachine();

        CuttingMachine cuttingMachine = new CuttingMachine("Solar", 10, "Plastic", "Cutting", true, "Metal blade");
        cuttingMachine.createMachine();

        WashingMachine washingMachine = new WashingMachine("Electric", 20, "Plactic & Metal", "Washing", true, 8, "LG");
        washingMachine.createMachine();

        HighPressureWashingMachine highPressureWashingMachine = new HighPressureWashingMachine("Electric", 10, "Plastic & Rubber", "Industrial washing", true, 20, "Karcher", 100);
        highPressureWashingMachine.createMachine();

    }

}
