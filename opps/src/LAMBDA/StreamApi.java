package LAMBDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6,9,88,76, 7, 8);
       // Stream<Integer> data = list.stream();
        //Stream<Integer> filteredData = data.filter(n->n%2==0);
       // Stream<Integer> sortedData = filteredData.sorted();
       // Stream<Integer> mappedData = sortedData.map(n -> n*2);
      //  Stream<Integer> reducedData = mappedData.reduce(0,(c,e)->(c+e));
        // we can do all above in one line
        list.stream()
                .filter(n->n%2==0)
                .sorted()
                .map(n -> n*2)
//                .reduce(0,(c,e)->(c+e))
                .forEach(n-> System.out.println(n));
       // Stream<Integer> reducedData = data.reduce();
    }
}
