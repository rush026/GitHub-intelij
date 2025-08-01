import java.io.*;

public class handle {
    public static void main(String[] args)  {
        try {
            File myobj = new File("sher.txt");
            FileWriter w = new FileWriter("sher.txt");
            BufferedWriter b = new BufferedWriter(w);
            b.write("learning learning learning and implement  111111");

            b.close();
            FileReader r = new FileReader("sher.txt");
            BufferedReader br = new BufferedReader(r);
            System.out.println(br.readLine());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
