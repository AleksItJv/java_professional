package homework_14.add_task;

public class DeamonThread implements Runnable {



    @Override
    public void run() {
        System.out.println("I am Deamon Thread");
        for (int i = 10; i > 0; i--) {
            try {
                //System.out.println("I am Deamon, working " + i + "seconds");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" I am Deamon - stop thread");
    }
}
