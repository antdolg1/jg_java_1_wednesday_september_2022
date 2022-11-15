package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_12;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch){
        boolean searchNumber = false;
        for (int element : arr) {
            if (element == numberToSearch) {
                searchNumber = true;
                break;
            }
        }
        return searchNumber;
    }
}