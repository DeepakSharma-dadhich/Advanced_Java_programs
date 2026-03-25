package Unit3Stream.practice_question;
import java.util.*;
import java.util.stream.*;

public class prog4 {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Deepak","Daksh","Aryan","Aaryan");
        List<String> s=names.stream()
        .filter(x->x.startsWith("A"))
        .collect(Collectors.toList());
        System.out.println(s);
    }
}
