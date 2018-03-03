package sort;

import java.util.List;

public class Common {

    void swap(int index1, int index2, List<Integer> toSort) {
        int temp = toSort.get(index1);
        toSort.set(index1, toSort.get(index2));
        toSort.set(index2, temp);
    }

    void replace(List<Integer> toSort, List<Integer> sorted) {

        for(int i=0; i< toSort.size(); i++) {
            toSort.set(i, sorted.get(i));
        }
    }
}
