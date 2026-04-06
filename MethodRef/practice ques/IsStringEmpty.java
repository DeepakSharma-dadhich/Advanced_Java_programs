// package MethodRef.practice ques;

interface inter{
    boolean check(String s);
}

//  class demo {
//     public void yes(){
//         System.out.println("hello  " );
//     } 

// }
public class IsStringEmpty {
    public static void main(String[] args) {
        // demo d=new demo();
        inter ref=String::isEmpty;
      boolean r= ref.check("");
      System.out.println(r);
    }
}
