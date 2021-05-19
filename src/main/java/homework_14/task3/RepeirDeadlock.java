package homework_14.task3;

public class RepeirDeadlock {

    public static void main(String[] args) {

        Thread frst = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Test2.class){
                    try {
                        System.out.println("first Hold class: Test2");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Test2.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Test1.class){
                        System.out.println("first Hold class: Test1");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("Finish first thread");
            }
        }, "first");
        Thread scnd = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Test1.class){
                    try {
                        System.out.println("second Hold class: Test1");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Test2.class){
                        System.out.println("second Hold class: Test2 & Test1");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Test2.class.notify();
                    }
                }
                System.out.println("Finish second thread");
            }
        }, "second");

        frst.start();
        scnd.start();

        try {
            frst.join();
            scnd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
