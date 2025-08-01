class c{
  public  void add(){
      int a=10,b=20;
      int c=a+b;
        System.out.println(c);
    }

    public void add(int i,int j){
      int c=i+j;
        System.out.println(c);
    }
    public void add(double i,int j){
      double c=i+j;
        System.out.println(c);
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        c r=new c();
        r.add();
        r.add(45,65);
        r.add(34.6,65);
    }
}
