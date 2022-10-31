package students.student_sergejs_kozinecs.lesson_3.level_7.Task_29;

class Keyboard {

    String model;
    int size;
    boolean hasRgb;
    boolean isWireless;

    public Keyboard(String model, int size, boolean hasRgb, boolean isWireless) {
        this.model = model;
        this.size = size;
        this.hasRgb = hasRgb;
        this.isWireless = isWireless;
    }

    void info() {
        System.out
                .println("Model: " + this.model + "\nSize: " + this.size + "\nRGB: " + this.answerYesOrNo(this.hasRgb)
                        + "\nWireless: " + this.answerYesOrNo(this.isWireless));
    }

    private String answerYesOrNo(boolean hasIt) {
        return hasIt ? "Yes" : "No";
    }

}
