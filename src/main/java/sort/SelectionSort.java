package sort;

import java.util.List;

public class SelectionSort {

    static Common common = new Common();

    public void sort(List<Integer> toSort) {

        int minIndex;
        int minValue;

        for (int i=0; i<toSort.size(); i++) {

            minIndex = i;
            minValue = toSort.get(minIndex);

            for (int j=i; j<toSort.size(); j++) {

                if (toSort.get(j) < minValue) {
                    minIndex = j;
                    minValue = toSort.get(minIndex);
                }
            }

            common.swap(i, minIndex, toSort);
        }
    }
}
