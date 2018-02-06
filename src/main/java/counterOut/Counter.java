package counterOut;

import java.util.LinkedList;
import java.util.List;

public class Counter {

    public static List newOutOrder(List<Integer> sth, int count) {

        List<Integer> lol = new LinkedList<>();
        count -= 1;
        int index = count%sth.size();
        
        while (!sth.isEmpty()) {
            index = index%sth.size();
            lol.add(sth.get(index));
            sth.remove(index);
            index += count;
        }
        return lol;
    }

    public static void main(String[] args) {

        List<Integer> sth = new LinkedList<>();
        sth.add(1);
        sth.add(2);
        sth.add(3);
        sth.add(4);
        sth.add(5);

        List<Integer> tht = newOutOrder(sth, 3);
        for (Integer i: tht) {
            System.out.println(i);
        }
    }
}