package lambdas;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        //lambda d
        // e una interface creada
        Intern1 i1 = (a)-> System.out.println(a);
        i1.met(100);

        Intern1 i2 = (b)-> System.out.println(100 * b);
        i2.met(15);

        List<Integer> nums = List.of(10,4,21,3,17,8,20,11);
        List<Integer> nums2 = List.of(10,4,1,9,17,8,28,11);
        //lambda de foreach
        nums.forEach(n -> {
            if(n%2==0) System.out.println(n);
        });

        //Consumer
        List<String> letter = List.of("one","two","three");
        Consumer cs = c -> System.out.print(c);
        Consumer out = cs.andThen(o -> System.out.println(":" + o.toString().toUpperCase()));

        letter.forEach(out);

        //BiPredicate
        BiPredicate<Integer,Integer> bi = ( a, b) -> {return a == b;};

        for (int i = 0; i< nums.size(); i++){
            System.out.println(bi.test(nums.get(i), nums2.get(i)));
        }

    }
}
