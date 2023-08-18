class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println(this.getName());
            i++;
        }
    }
}

public class threadpriorities {
   public static void main(String[] args) {
    mythread t1 = new mythread("1");
    mythread t2 = new mythread("2");
    mythread t3 = new mythread("3");
    mythread t4 = new mythread("4");
    mythread t5 = new mythread("5");

    t5.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
   } 
}
