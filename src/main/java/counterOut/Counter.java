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
}