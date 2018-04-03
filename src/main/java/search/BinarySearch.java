package search;

public class BinarySearch {

    public boolean binSearch(int[] array, int value) {

        int size = array.length;
        int pivotIndex = size/2;

        if (array[pivotIndex] == value) return true;
        else {
            if (array.length == 1) return false;
        }


            if (array[pivotIndex] > value) {
                return binSearch(subArray(array, 0, pivotIndex), value);

            } else {
                return binSearch(subArray(array, pivotIndex, array.length), value);
            }
    }

    private int[] subArray(int[] array, int lowerIndex, int upperIndex) {

        int[] newArray = new int[upperIndex-lowerIndex];

        int j = 0;
        for (int i = lowerIndex; i<upperIndex; i++) {
            newArray[j++] = array[i];
        }
        return newArray;
    }
}
