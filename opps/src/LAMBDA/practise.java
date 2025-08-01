package LAMBDA;
interface A{
    void show();
}
//class B implements A{
//    public void show(){
//        System.out.println("Hello!");
//    }
//}
public class practise {
    public static void main(String[] args) {
      A obj = () ->   System.out.println("Hello!");



//    B obj = new B();
//    obj.show();
    }
}
