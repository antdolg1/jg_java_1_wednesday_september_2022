package students.student_sergejs_kozinecs.lesson_3.level_7.Task_29;

class Processor {

    String model;
    int cores;
    int threads;

    public Processor(String model, int cores, int threads) {
        this.model = model;
        this.cores = cores;
        this.threads = threads;
    }

    void info() {
        System.out.println("Model: "  + this.model + "\nCores: " + this.cores + "\nThreads: " + this.threads);
    }

}
