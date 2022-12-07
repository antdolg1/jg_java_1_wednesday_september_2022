package teacher.lesson_10.lessoncode.ArrayAdvanced;

public class IntArrayImpl implements IntArray {

    private int[] array;

    public IntArrayImpl() {
        array = new int[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int getByIndex(int index) {
        return array[index];
    }

    @Override
    public void add(int element) {
        int currentSize = size();
        int[] newArray = new int[currentSize + 1];

        if (currentSize >= 0) {
            System.arraycopy(array, 0, newArray, 0, currentSize);
        }

//        same as:
//        for (int i = 0; i < currentSize; i++) {
//            newArray[i] = array[i];
//        }

        newArray[newArray.length - 1] = element;
        array = newArray;
    }

    @Override
    public void removeByIndex(int index) {
        int currentSize = size();
        int[] newArray = new int[currentSize - 1];
        int indexToPut = 0;
        for (int i = 0; i < currentSize; i++) {
            if (i != index) {
                newArray[indexToPut] = array[i];
                indexToPut++;
            }
        }
        array = newArray;
    }
}
