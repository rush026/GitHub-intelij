import java.util.Scanner;
public class lab4b{
  public static void main(String[] args){
try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter a string :");
  String s= sc.nextLine();
  String revstr="";
  for(int i=s.length()-1; i>=0; i--){
  revstr= revstr+s.charAt(i);
  }
  System.out.println("after reverse string is " +revstr);
}
}
}