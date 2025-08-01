import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList();
        ar.add("fd");
        ar.add("j");
        ar.add("sj");
        ar.add("fhj");
        System.out.println(ar);
        ar.remove(1);
        System.out.println(ar);
        ar.add(2,"df");
        System.out.println(ar);
        ar.remove(3);
        System.out.println(ar);
    }
}
