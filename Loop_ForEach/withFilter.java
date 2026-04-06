package Loop_ForEach;
import java.util.*;
public class withFilter {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(1,2,3,4,5);
        number.stream()
        .filter(n->n%2==0)
        .forEach(n->System.out.print(n +"  "));

    }
}
