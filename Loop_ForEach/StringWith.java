package Loop_ForEach;

import java.util.ArrayList;
import java.util.List;

public class StringWith{
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Deepak");
        l.add("Rehan");
        l.add("Aaryan");


        l.forEach(i->System.out.println(i.toUpperCase()));
        l.forEach(j->System.out.println("Hello "+j));
        l.forEach(k->System.out.println(k.startsWith("A") + k));
        l.forEach(ab->{
            if(ab.length()>5){
                System.out.println(ab);
            }
        });

    }
}
