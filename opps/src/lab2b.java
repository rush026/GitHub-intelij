public class lab2b{
    public static void main(String[]args){
        System.out.println("Number of arguments passed:"+args.length);
        System.out.println("First number:"+args[0]);
        System.out.println("Second number:"+args[1]);
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        System.out.println("Sum of integer:"+n1+" and "+n2+" is "+ (n1+n2));
        System.out.println("Difference of integer:"+n1+" and "+n2+" is "+ (n1-n2));
        System.out.println("Product of integer:"+n1+" and "+n2+" is "+ (n1*n2));
        System.out.println("Division of integer:"+n1+" and "+n2+" is "+ (n1/n2));
    }
}
