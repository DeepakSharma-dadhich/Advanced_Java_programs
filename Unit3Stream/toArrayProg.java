package Unit3Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;

public class toArrayProg {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(42);
        l1.add(0);
         l1.add(4);
        l1.add(5);
        l1.add(22);

        Object obj[]=l1.stream()
           .toArray();
           System.out.println(Arrays.toString(obj));
    }
}
// it is a terminal operation which is user to convert stream into array with the help of to-array()