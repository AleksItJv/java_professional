package homework_13.task3;

public class Main implements Runnable {

    public static void main(String[] args) {

        Main mn = new Main();
        Thread.currentThread().setName("ThreadMain");
        Thread fst = new Thread(new PriorityRunner(), "MinPriorityRunner");
        Thread scnd = new Thread(new PriorityThread(), "MaxPriorityThread");

        fst.setPriority(Thread.MIN_PRIORITY);
        scnd.setPriority(Thread.MAX_PRIORITY);

        System.out.println(Thread.currentThread().getName() + ": Thread Priority = " + Thread.currentThread().getPriority());
        System.out.println(fst.getName() + ": Thread Priority = " + fst.getPriority());
        System.out.println(scnd.getName() + ": Thread Priority = " + scnd.getPriority());

        scnd.start();
        mn.run();
        fst.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}
