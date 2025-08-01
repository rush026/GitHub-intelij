class animal{
    public void animalsound(){
        System.out.println("enter the animal name");

    }
}
class dog extends animal{

    public void animalsound() {
        System.out.println("dog:bhown bhown");
    }
}
class cat extends animal{

    public void animalsound() {
        System.out.println("cat:miaun miaun");
    }
}
public class janawar {
    public static void main(String[] args) {
        animal myanimal=new animal();
        animal mydog=new dog();
        animal mycat=new cat();
        myanimal.animalsound();
        mydog.animalsound();
        mycat.animalsound();

    }
}
