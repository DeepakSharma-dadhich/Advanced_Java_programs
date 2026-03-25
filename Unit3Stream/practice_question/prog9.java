package Unit3Stream.practice_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prog9 {
     public static void main(String[] args) {
        List<String> names=Arrays.asList("Deepak","Daksh","Aryan","Aaryan","Somaa");
        List<String> s=names.stream()
        .filter(x->x.length()>5)
        .collect(Collectors.toList());
        System.out.println(s);
    }
}
