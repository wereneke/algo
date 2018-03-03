package sort;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort) {

        if (toSort == null) throw new IllegalArgumentException();

        List<Integer> left = toSort.subList(0, toSort.size()/2);
        List<Integer> right = toSort.subList(toSort.size()/2, toSort.size());

        if (left.size() > 1) sort(left);
        if (right.size() > 1) sort(right);

        merge(toSort, left, right);


    }

    private void merge(List<Integer> toSort, List<Integer> left, List<Integer> right) {

        List<Integer> sorted = new LinkedList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {

            if (left.get(leftIndex) <= right.get(rightIndex)) {
                sorted.add(left.get(leftIndex));
                leftIndex++;
            } else {
                sorted.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        if (leftIndex < left.size()) {
            for (int i = leftIndex; i<left.size(); i++) {
                sorted.add(left.get(i));
            }
        }
        if (rightIndex < right.size()) {
            for (int i = rightIndex; i<right.size(); i++) {
                sorted.add(right.get(i));
            }
        }

        replace(toSort, sorted);
    }

    private void replace(List<Integer> toSort, List<Integer> sorted) {

        for(int i=0; i< toSort.size(); i++) {
            toSort.set(i, sorted.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> w = new LinkedList<>();
        Random r = new Random();
        MergeSort m = new MergeSort();

        int a;
        for (int i = 0; i < 1000; i++) {
            a = r.nextInt();
            w.add(a);
        }
        float start = System.nanoTime();
        m.sort(w);
        float elapsedTime = System.nanoTime() - start;
//
//        w.forEach(System.out::println);
        System.out.println(elapsedTime);

    }
}
