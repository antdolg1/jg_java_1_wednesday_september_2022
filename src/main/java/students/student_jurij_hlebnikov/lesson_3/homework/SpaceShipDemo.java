package students.student_jurij_hlebnikov.lesson_3.homework;

class SpaceShipDemo {

    public static void main(String[] args) {

        AfterBurner coldGas = new AfterBurner("Cold Gas-50MN", 25);
        SpaceShip corax = new SpaceShip("Deus Ignia", 305, false, 0);
        GaussAnnihilatorGun soulReaver = new GaussAnnihilatorGun("GaussAnnihilator", 5000);
        corax.systemCheck();
        System.out.println("------------------------------------");
        corax.insure();
        corax.installAB(coldGas);
        corax.systemCheck();
        System.out.println("------------------------------------");
        corax.installGAG(soulReaver);
        corax.systemCheck();
    }
}
