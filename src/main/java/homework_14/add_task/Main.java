package homework_14.add_task;

public class Main {

    public static void main(String[] args) {

        Thread first = new Thread(new DeamonThread(), "Deamon1");
        Thread second = new Thread(new DeamonThread(), "Deamon2");
        Thread userThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("User thread");
                try {
                    for (int i = 3; i > 0 ; i--) {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("User thread stop. Stop all daemons");
            }
        });

        first.setDaemon(true);
        second.setDaemon(true);

        first.start();
        second.start();
        userThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------");
        first.setPriority(1);
        System.out.println(first.getName() + " Priority: " + first.getPriority());
        System.out.println(first.getName() + " Deamon Thread?: " + first.isDaemon());
        System.out.println(first.getName() + " Interrupted?: " + first.isInterrupted());
        System.out.println(first.getName() + " Alive?: " + first.isAlive());
        first.setName("DeamonOne");
        System.out.println("What is new name?: " + first.getName());
        System.out.println(first.getName() + " Id: " + first.getId());
        System.out.println(first.getName() + " State: " + first.getState());
        System.out.println(first.getName() + " Class Loader: " + first.getContextClassLoader());
        System.out.println("------------------------------------------------------------------");

        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main close");

    }
}
