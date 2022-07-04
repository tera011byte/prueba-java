import java.util.Comparator;

public class Building implements Comparator<Integer> {

    //@Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }


}

