import java.util.Arrays;
import java.util.Base64;

public class Barn extends Building {
    public static void main(String[] args) {
        Integer [] primes = {2,7,5,3};
        Building b1 = new Building();
        Arrays.sort(primes,b1);
        for(Integer i: primes){
            System.out.print(i + " ");
        }
        int n = 33;

        if(n>30){
            System.out.println("fox");
        } else if (n < 50) {
            System.out.println("la");
        }

    }
}
