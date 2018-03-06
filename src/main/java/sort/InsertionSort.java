package sort;

import java.util.List;

public class InsertionSort {

    static Common common = new Common();

    public void sort(List<Integer> toSort) {

        for (int i=1; i<toSort.size(); i++) {

            int currentIndex = i;
            while (currentIndex-1>=0 && toSort.get(currentIndex-1)>=toSort.get(currentIndex)) {
                common.swap(currentIndex-1, currentIndex, toSort);
                currentIndex--;
            }
        }
    }
}
