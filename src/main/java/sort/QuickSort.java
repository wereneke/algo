package sort;

import java.util.List;

public class QuickSort {

    static Common common = new Common();

    public void sort(List<Integer> toSort) {

        if (toSort.size()>1) {
            int pivotIndex = 0;
            int pivot = toSort.get(pivotIndex);
            for (int i = 1; i<toSort.size(); i++) {
                if (toSort.get(i) < pivot) {
                    common.swap(pivotIndex, i, toSort);
                    pivotIndex = i;
                }
            }

            sort(toSort.subList(0, pivotIndex));
            sort(toSort.subList(pivotIndex+1, toSort.size()));
        }
    }

}
