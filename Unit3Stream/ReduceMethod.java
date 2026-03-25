package Unit3Stream;
import java.util.*;

public class ReduceMethod {
     public static void main(String[] args) {
        List<Integer> l1=List.of(10,20,3,11,-2,-3);
        Optional<Integer> x=l1.stream()
          //.reduce((e1,e2)->e1+e2 ).ifPresent(System.out::println);
            .reduce((e1,e2)->e1*e2 );
          System.out.println(x);

//////////////////////////
List<String> l2=List.of("hi ","this ","is ","your ","boss.");
       
       String s= l2.stream()
       .filter(str-> str.length()>3)
           .reduce("" ,(e1,e2)->e1+e2 );
            System.out.println(s);
/////////////////////////
/// 
    
    Optional<Integer> x1=l1.stream()
         .reduce((xx,y)->xx>y?xx:y);
          System.out.println(x1);

      //////////////////////////////
      /// 
         int result= l1.stream()
          .reduce(0,(m,n)->m+1);
          System.out.println(result);

/////////////////////////////////////
/// print sum of even numbers 
        int even=l1.stream()
        .filter(w->w%2==0)
        .reduce(0,(q,p)->q+p);
        System.out.println(even);

        /////////////////////////////////
        /// multiply only odd numbers 
        int mul=l1.stream()
        .filter(w->w%2!=0)
        .reduce(1,(q,p)->q*p);
        System.out.println(mul);

        /////////////////////////////////////////
        /// replace all negative no with 0 and then sum
        int neg=l1.stream()
        .map(a->a<0?0:a)
        .reduce(0,Integer::sum);
        System.out.println(neg);


        /////////////////////////////////////////////
        /// longest string
        
        

     }     
}
