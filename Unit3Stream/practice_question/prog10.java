package Unit3Stream.practice_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prog10 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(4,-33,11,444,-2,-1);
        List<Integer> num=l.stream()
        .filter(x->x%3==0)
        .collect(Collectors.toList());
        System.out.println(num);
    }
    
}
