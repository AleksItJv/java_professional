package homework_13.add_task;

public class WorkFirst implements Runnable {

    private String name = "first";
    private int number = 1;

    public WorkFirst() {
    }

    public WorkFirst(String name, int number) {
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
        for (int i = 0; i < 10; i++) {

            synchronized (Main.count) {
                try {
                    Main.count.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Main.count.add(1);
                System.out.println(Thread.currentThread().getName() + "  " + Main.count);
                Main.count.notify();

            }
        }
    }
}
