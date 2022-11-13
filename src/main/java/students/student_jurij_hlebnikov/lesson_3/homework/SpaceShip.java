package students.student_jurij_hlebnikov.lesson_3.homework;

class SpaceShip {

    String name;
    int speed;
    boolean insured;
    AfterBurner afterBurner;
    GaussAnnihilatorGun gag;
    int damage;

    public SpaceShip(String name, int speed, boolean insured, int damage) {
        this.name = name;
        this.speed = speed;
        this.insured = insured;
        this.damage = damage;
    }

    public void systemCheck() {
        System.out.println("Ship Name: " + name);
        System.out.println("Ship Max Speed: " + speed);
        System.out.println("Ship is Insured: " + insured);
        System.out.println("Ship Damage: " + damage);
        if (afterBurner != null) {
            System.out.println("Modules-------");
            afterBurner.showInfo();
        }
        if (gag != null) {
            System.out.println("Modules-------");
            gag.showInfo();
        }
    }

    public void insure() {
        this.insured = true;
    }

    public void installAB(AfterBurner ab) {
        this.afterBurner = ab;
        this.speed = this.speed * ab.speedModifier;
    }

    public void installGAG(GaussAnnihilatorGun gun) {
        this.gag = gun;
        this.damage = this.damage + gag.dmgPerSek;
    }
}

