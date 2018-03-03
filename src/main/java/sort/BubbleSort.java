package sort;

import java.util.List;

public class BubbleSort {

    Common common = new Common();

    public void sort(List<Integer> toSort) {

        int listSize = toSort.size();
        for (int i=0; i<listSize; i++) {
            for (int j=0; j<listSize-1; j++) {

                if (toSort.get(j)>toSort.get(j+1)) common.swap(j, j+1, toSort);
            }
        }
    }
}
