class bank{
    public void rateofinterest(){
        System.out.println("enter the bank name");;
    }
}
class PNB extends bank{
    public void rateofinterest(){
        System.out.println("PNB rate of interest:10");
    }
}
class Axis extends bank{
    public void rateofinterest(){
        System.out.println("Axis rate of interest is 9%");
    }
}
class Kotak extends bank{
    public void rateofinterest(){
        System.out.println("kotak rate of interest is 8%");
    }
}
public class rateofinterestbank {
    public static void main(String[] args) {
        bank mybank=new bank();
        bank bankPNB=new PNB();
        bank bankAxis=new Axis();
        bank bankKotak=new Kotak();
        bankPNB.rateofinterest();
        bankAxis.rateofinterest();
        bankKotak.rateofinterest();
    }
}
