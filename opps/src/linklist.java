import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList();
        l.add(3);
        l.add(3);
        l.add(4);
        l.add(1);
        System.out.println(l);
        l.remove();
        System.out.println(l);
        System.out.println(l.remove(2));
        System.out.println(l);
    }
}
