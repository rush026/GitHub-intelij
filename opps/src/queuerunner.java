import java.util.LinkedList;
import java.util.Queue;

public class queuerunner {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(32);
        q.offer(33);
        q.offer(54);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.size());

    }
}