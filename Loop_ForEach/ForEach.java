package Loop_ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
         l.add(20);
          l.add(30);
           l.add(40);
            l.add(50);
            l.forEach(i->System.out.println(i));
            //method reference
            l.forEach(System.out::println);
            // print only divisible by 4
             l.forEach(i->{
                if(i%4==0)
                    System.out.println(i);
            });
    }
}
