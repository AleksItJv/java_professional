package homework_13.add_task;

public class WorkSecond implements Runnable {

    private String name = "second";
    private int number = 2;

    public WorkSecond() {
    }

    public WorkSecond(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            synchronized (Main.count) {

                Main.count.add(1);
                System.out.println(Thread.currentThread().getName() + " " + Main.count);
                Main.count.notify();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Main.count.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
