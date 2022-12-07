package teacher.lesson_10.lessoncode;

public enum Season {
    WINTER("December, January, February"),
    SPRING("March, April, May"),
    SUMMER("June, July, August"),
    AUTUMN("September, October, November");

    private String monthNames;

    public String getMonthNames() {
        return monthNames;
    }

    Season (String monthNames) {
        this.monthNames = monthNames;
    }
}
