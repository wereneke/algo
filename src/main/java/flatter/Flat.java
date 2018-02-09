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

    public static void main(String[] args) {

        Flat f = new Flat();

        List<String> kasie = new LinkedList<>();
        kasie.add("Kasia");
        kasie.add("kasia");
        List<Object> misie = new LinkedList<>();
        misie.add(kasie);
        misie.add(1);
        misie.add(2);
        List<Object> kaczuszki = new LinkedList<>();
        kaczuszki.add(1);
        kaczuszki.add("pysia");
        kaczuszki.add(misie);

        for (Object o: f.flatter(kaczuszki)) {
            System.out.println(o);
        }
    }
}
