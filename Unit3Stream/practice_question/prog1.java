package Unit3Stream.practice_question;
import java.util.*;
import java.util.stream.*;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class prog1 {
    public static void main(String[] args) {
        List<Student> list=Arrays.asList(
            new Student("Deepak"),
            new Student("Daksh"),
            new Student("rehan")
        );
        List<String> names=list.stream()
        .map(s->s.name)
            .collect(Collectors.toList());
        System.out.println(names);
    }
    
}
