package students.student_ignat_parfenov.lesson_9.homework.level_2_intern.Task7;

class ComputerPlayer extends Player {

    private int experience;

    public ComputerPlayer(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "experience=" + experience +
                '}';
    }
}
