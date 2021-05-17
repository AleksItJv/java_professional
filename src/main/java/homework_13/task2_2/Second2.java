package homework_13.task2_2;

public class Second2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
        }
        System.out.println("Thread 'second' is close");
    }
}
