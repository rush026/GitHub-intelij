class B
{
    public void show(){
        System.out.println("afvhfgvwh");

    }
}
public class anonymousclass {
    public static void main(String[] args) {
        B a=new B(){
            public void show()
            {
                System.out.println("fhiuef");
            }
        };
        a.show();
    }
}
