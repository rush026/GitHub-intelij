class parent{
    public void bikename(){
        System.out.println("honda");
    }
}
class child extends parent{
    public void cyclename(){
        System.out.println("hero");
    }
}
public class inheritence {
    public static void main(String[] args) {
        child c=new child();
        c.bikename();
    }
}
