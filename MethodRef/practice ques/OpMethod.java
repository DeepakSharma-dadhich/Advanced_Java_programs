interface MathUtil{
     int cal(int x,int y);
    
}
class A{
    static int addition(int x,int y){
        return x+y;
        }

        static int max(int x,int y){
            if(x>y){
                return x;  
            }else
                return y;
        }
//     static int Check(int x, int y) {
//     return (x % 2 == 0) ? x : y;
// }
}

public class OpMethod {
    public static void main(String[] args) {
        MathUtil ref=A::addition;
        System.out.println(" addition of a and B is :"+ ref.cal(1,3));
        MathUtil ref1=A::max;
        System.out.println("max num is : " + ref1.cal(1,3));
        // MathUtil ref2=A::Check();
        // System.out.println(ref2.cal(4,6));


    }
}
