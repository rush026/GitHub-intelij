@FunctionalInterface
interface A{


    void sub(int i,int j);
}
public class functionalinterfacee {
    public static void main(String[] args) {
        A obj=new A()
        {
            @Override
            public void sub(int i, int j) {

            }

            public void show(){
                System.out.println("show");
            }
        };
       // obj.show();
        //basic lemda expresion use
      //  A obj=()-> System.out.println("show");
        //obj.show();
//        A sum=(i,j)-> System.out.println(i-j);
//        sum.sub(3,4);

    }
}
