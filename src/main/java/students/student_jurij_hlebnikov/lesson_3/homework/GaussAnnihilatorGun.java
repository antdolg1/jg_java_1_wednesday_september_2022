package students.student_jurij_hlebnikov.lesson_3.homework;

class GaussAnnihilatorGun {

    String name;
    int dmgPerSek;

    public GaussAnnihilatorGun(String name, int dmgPerSek) {
        this.name = name;
        this.dmgPerSek = dmgPerSek;
    }

    public void showInfo() {
        System.out.println("GAG Name: " + name);
        System.out.println("GAG Damage: " + dmgPerSek);
    }
}
