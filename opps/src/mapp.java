import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class mapp {
    public static void main(String[] args) {
        Map<Integer, String> myhashmap = new HashMap();
        myhashmap.put(1, "a");
        myhashmap.put(2, "b");
        myhashmap.put(3, "c");
        System.out.println(myhashmap);
//        Set<Integer> I=myhashmap.keySet();
//        for(Integer i:I){
//            System.out.println(i+" : "+myhashmap.get(i));
//            Set<Map.Entry<Integer,String>> J=myhashmap.entrySet();
//            for(Map.Entry<Integer,String> e:J){
//                System.out.println(e.getKey()+":"+e.getValue());
//    }
//}
               Map<Integer,String> mylinkedmap=new LinkedHashMap<>();
                mylinkedmap.put(1,"a");
                mylinkedmap.put(2,"b");
                mylinkedmap.put(3,"c");
                System.out.println(mylinkedmap);
        System.out.println(mylinkedmap.get(1));
        Set<Map.Entry<Integer,String>> M=mylinkedmap.entrySet();
        for(Map.Entry<Integer,String> e:M){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
