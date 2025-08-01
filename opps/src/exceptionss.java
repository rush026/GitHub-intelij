public class exceptionss {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println(a[8]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
