package homework_13.task2;

public class First implements Runnable {

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            //System.out.println(Thread.currentThread().getName() + "->" + i);
        }
        if (Thread.currentThread().getName().equalsIgnoreCase("first")){
            System.out.println("Thread 'first' is close");
        }
        if (Thread.currentThread().getName().equalsIgnoreCase("second")){
            System.out.println("Thread 'second' is close");
        }

    }
}
