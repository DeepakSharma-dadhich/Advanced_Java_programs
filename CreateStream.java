package Unit3Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        System.out.println("way 1 :");
        int arr[]={2,1,9,5,3,2,1};
        IntStream s=Arrays.stream(arr);
        s.forEach(x->System.out.print(x+" "));
//////////////////////////////////////////////////
       System.out.println("");
       System.out.println("way 2 : ");
       Stream<Integer> s2=Stream.of(2,5,3,2,1);
       List<Integer>l4=s2.filter(y-> y<3).collect(Collectors.toList());
       System.out.println(l4);
    // forEach(y->System.out.println(y));


       /////////////////////////////////////////
       System.out.println("way 3");
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(42);
        l1.add(0);
         l1.add(4);
        l1.add(5);
        l1.add(22);

        Stream<Integer> s3 =l1.stream();
        s3.filter(y-> y%2==0)
        .limit(3)
        .forEach(y->System.out.println(y));

        /////////////////////////////
        System.out.println("way 4");
        List<Integer> l2=new ArrayList<>();
        l2.add(4);
        l2.add(12);
        l2.add(66);
        l2.add(4);
        l2.add(3);
        l2.add(1);
        l2.add(33);


        Stream<Integer> s22 =l2.stream();
        s22.distinct()

        .skip(1)//skip the value from begining 
        .limit(4) //limit how much data or index we want
        .forEach(y->System.out.print(y +" "));
long Count=l2.stream().count();
System.out.println("\nno of elements :"+ Count);

    }
}
