package students.student_ignat_parfenov.lesson_9.homework.level_2_intern;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }
}