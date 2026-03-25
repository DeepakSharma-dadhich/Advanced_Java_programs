package Unit3Stream.practice_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prog11 {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Deepak","Daksh","Aryan","Aaryan","Somaa");
        List<String> s=names.stream()
        .map(x->x.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(s);
    }
}
