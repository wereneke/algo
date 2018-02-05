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

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(bs.binSearch(arr, 7));
    }

}
