package SealedClass;
// Sealed Class -limit which class are allowed to extend it
// if we want ki pure inheritance naa   ...so we use sealed class 
// with final there if full restriction
// if we make a class sealed then we have to make child class sealed,non sealedor final 

sealed class A permits B,C{
    void disp(){
        System.out.println("thats the content of sealed class ");
    }
}
final class B extends A{
    void Show(){
        System.out.println("inside b class");
    }
}
non-sealed class C extends A{
    void display(){
        System.out.println("inside c class");
    }
}

public class topic{
    public static void main(String[] args) {
        C cc=new C();
        cc.disp();
        cc.display();
        B bb=new B();
        bb.Show();
        bb.disp();
    }
}