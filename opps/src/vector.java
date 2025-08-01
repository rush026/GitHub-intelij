import java.util.Vector;
public class vector {
    public static void main(String[] args) throws Exception
    {
        Vector<Integer> in=new Vector<Integer>(20);
        in.addElement(12);
        in.add(32);
        System.out.println(in.capacity());
        System.out.println(in);
        in.remove(1);
        System.out.println(in);

    }
}
