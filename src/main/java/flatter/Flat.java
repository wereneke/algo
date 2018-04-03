package flatter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Flat {
    
//     class responsible for flattening multidimensional list
//     {a, b, {c, {d, e, {f, g}, h}}, i} ~~ {a, b, c, d, e, f, g, h, i}

    public List<Object> flatter(List items) {

        ArrayList<Object> flat = new ArrayList<>();

        for (Object item: items) {
            if (item instanceof List) {
                flat.addAll(flatter((List) item));
            }
        else {
                flat.add(item);
            }
        }
        return flat;
    }
}
