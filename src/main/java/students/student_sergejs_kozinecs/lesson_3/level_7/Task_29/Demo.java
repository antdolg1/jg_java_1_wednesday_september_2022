package students.student_sergejs_kozinecs.lesson_3.level_7.Task_29;

class Demo {

    public static void main(String[] args) {
        Processor ryzen = new Processor("Ryzen 9 5950x", 16, 32);
        Keyboard keychron = new Keyboard("Keychron K3 Ultra-slim Wireless Mechanical Keyboard", 64, true, false);

        ryzen.info();
        keychron.info();
    }

}
