package MethodRef.topic;
@FunctionalInterface
interface Calculator{
    int calculate(int x,int y);
}
// 1...if function is static
//interfacename ref = classname::methodname;(without brackets ) 
//reference.interfunName(); 
class demo{
     static int divi(int x,int y){
        return x/y;
    }
}
// 2...if calling non static function 
class mul{
    int product(int x,int y){
        return x*y;
    }

}
//  3. reference method for an arbitrary object
interface int1{
    String show(String s);
}

// 4...
interface Myip{
    Student get();  //returntype is student bcz we want an obj as rt;
}
class Student{
    Student(){
System.out.println("create  student ");
    }
}

public class MethodReference {
    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;
        // Calculator mul=(a,b)->a*b;
        // Calculator div=(a,b)->a/b;
        

        System.out.println("addition :" + add.calculate(5,10));
        System.out.println("Subtraction :" + sub.calculate(5,10));
        // System.out.println(" multiplication:" + mul.calculate(5,10));
        // System.out.println(" division:" + div.calculate(5,10));
        
        // 1.ClassName::staticMethodName
        Calculator ref =demo::divi;
         System.out.println("Division : " + ref.calculate(10,5));

       //2. objectReference::instanceMethod
         mul m=new mul();
         Calculator cl=m::product;
        System.out.println(" multiplication:" + cl.calculate(5,10));

        //3. ClassName::instanceMethod
        // int1 i2=String::length;//defination of interface method
        // System.out.println(i2.show("hello bro"));
        int1 i3=String::toUpperCase;
        System.out.println(i3.show("helloooo"));

        //4.
        Myip ref1=Student::new;
        ref1.get();


    }
}
// we can create a many lambda fubnctions for a single functional interface
// method reference 
