package Unit3Stream.practice_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prog12 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(4,-33,11,444,-2,-1);
        List<Integer> num=l.stream()
        .map(x->x+10)
        .collect(Collectors.toList());
        System.out.println("list after adding 10 in each element " +num);
        System.out.println("actual list is :" + l);
    }
}
