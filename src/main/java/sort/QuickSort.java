package sort;

import java.util.List;

public class QuickSort {


    public void qsort(List<Integer> toSort) {

        if (toSort.size()>1) {
            int pivotIndex = 0;
            int pivot = toSort.get(pivotIndex);
            for (int i = 1; i<toSort.size(); i++) {
                if (toSort.get(i) < pivot) {
                    swap(pivotIndex, i, toSort);
                    pivotIndex = i;
                }
            }

            qsort(toSort.subList(0, pivotIndex));
            qsort(toSort.subList(pivotIndex+1, toSort.size()));
        }
    }

    private void swap(int index1, int index2, List<Integer> toSort) {
        int temp = toSort.get(index1);
        toSort.set(index1, toSort.get(index2));
        toSort.set(index2, temp);
    }

}
