package Unit3Stream;
import java.util.*;
public class SortMethodOnStream {
    public static void main(String[] args) {
        List<Integer> l1=List.of(3,5,6,1,2,31,4);
        List<Integer> l2=l1.stream()
        // .sorted(Comparator.reverseOrder()).toList();
        // System.out.println(l2);

        .sorted((x,y)->x.compareTo(y)).toList();
        System.out.println(l2);
       int minn= l1.stream().min((x,y)->x.compareTo(y)).get();
       System.out.println(minn);

    }
}
