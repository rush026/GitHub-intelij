class thread1 extends Thread {
   @Override
    public void run() {
       for(int i=0;i<100;i++) {
            System.out.println("hey1");
          try {
              Thread.sleep(2);
          }catch(InterruptedException e){
              e.printStackTrace();
          }
            System.out.println("hey2");
          try{
              Thread.sleep(2);
          }catch(InterruptedException e){
              e.printStackTrace();
          }
        }
    }
}
class thread2 extends Thread{
   @Override
   public void run(){
        for(int i=0;i<100;i++){

            System.out.println("go");
            try{
                Thread.sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("shooter");
            try{
                Thread.sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class threads {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try{
            Thread.sleep(3);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
