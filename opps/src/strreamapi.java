import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class strreamapi {
    public static void main(String a[]) {
        List<Integer> l=Arrays.asList(1,40,3,4,5,2);
    l.forEach ( n->  System.out.println(n));
       Stream<Integer> s1= l.stream();
     Stream<Integer> s2=s1.filter(n->(n%2==0));
     Stream<Integer> s3=s2.map(n->n*5);
  // int result=s3.reduce(0,(e,c)->e+c);
  //      System.out.println(result);
        s3.forEach(n-> System.out.println(n));

      //  int result=l.stream()
       //         .filter(n->n%2==0)
        //        .map(n->n*10)
       //         .reduce(0,(e,c)->c+e);
       // System.out.println(result);
//       Stream<Integer> sortedvalues= l.stream()
//        .filter(n->n%2==0)
//               .sorted();
//       sortedvalues.forEach(n-> System.out.println(n));

    }
}
