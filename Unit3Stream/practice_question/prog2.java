package Unit3Stream.practice_question;
import java.util.*;
import java.util.stream.*;


public class prog2 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(11,44,66,88,44);
        List<Integer> num=l.stream()
        .filter(x->x>50)
        .collect(Collectors.toList());
        System.out.println(num);
    }
    
}
