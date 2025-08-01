public class exceptionhandling {
    public static void main(String[] args) {
        int a[]=new int[5] ;
        System.out.println("ghdjk");
       try{
           int b=8/0;
           System.out.println(a[6]);
       //}catch(ArrayIndexOutOfBoundsException e){
           System.out.println("try to find out");
       }catch(ArithmeticException e){
           System.out.println(e.getMessage());
           System.out.println(e.getClass());
       }
        System.out.println("the End::");
    }
}
