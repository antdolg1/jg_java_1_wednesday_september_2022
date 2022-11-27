package students.student_vladislav_saksin.lesson3.level7;

class Warehouse {

    String name;
    String address;
    int numberOfPallets;
    int numberOfContainers;

    Warehouse(String name, String address, int numberOfPallets,
              int numberOfContainers) {

        this.name = name;
        this.address = address;
        this.numberOfPallets = numberOfPallets;
        this.numberOfContainers = numberOfContainers;

    }

    void addPallets(int palletsToAdd) {
        numberOfPallets = numberOfPallets + palletsToAdd;
        System.out.println("Added: " + palletsToAdd);
    }

    void removePallets(int palletsToRemove) {
        numberOfPallets = numberOfPallets - palletsToRemove;
        System.out.println("Removed: " + palletsToRemove);
    }

    void checkNumberOfPallets() {
        System.out.println("Actual number of pallets in " + name + ", " + address + " = " + numberOfPallets + " pcs.");
    }

    void addContainers(int containersToAdd) {
        numberOfContainers = numberOfContainers + containersToAdd;
        System.out.println("Added: " + containersToAdd);
    }

    void removeContainers(int containersToRemove) {
        numberOfContainers = numberOfContainers - containersToRemove;
        System.out.println("Removed: " + containersToRemove);
    }

    void checkNumberOfContainers() {
        System.out.println("Actual number of containers in " + name + ", " + address + " = " + numberOfContainers + " pcs.");
    }

    void totalUnits() {
        System.out.println("Total unit number is: " + (numberOfPallets + numberOfContainers) + " pcs.");
    }

}