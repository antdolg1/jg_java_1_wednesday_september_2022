package students.student_vladislav_saksin.lesson3.level7;

class WarehouseDemo {

    public static void main(String[] args) {

        Warehouse uniLogistics = new Warehouse("Uni Logistics", "Katlakalna str. 1",
                120, 12);

        uniLogistics.checkNumberOfPallets();
        uniLogistics.addPallets(100);
        uniLogistics.checkNumberOfPallets();
        uniLogistics.removePallets(37);
        uniLogistics.checkNumberOfPallets();

        System.out.println("====================================");

        uniLogistics.checkNumberOfContainers();
        uniLogistics.addContainers(55);
        uniLogistics.checkNumberOfContainers();
        uniLogistics.removeContainers(45);
        uniLogistics.checkNumberOfContainers();

        System.out.println("====================================");

        uniLogistics.totalUnits();

    }

}
