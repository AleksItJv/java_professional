package homework_14.task4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Repair2Deadlock {

    public static void main(String[] args) {

        Lock locker = new ReentrantLock();
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        Thread frst = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am " + Thread.currentThread().getName());
                for (int i = 0; i < 100; i++) {
                    //synchronized (test1) {
                    locker.lock();
                        Test1.addX();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //synchronized (test2){
                        locker.lock();
                            Test2.addY();
                        locker.unlock();
                        //}
                    locker.unlock();
                    //}
                }
            }

        }, "first");

        Thread scnd = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am " + Thread.currentThread().getName());

                for (int i = 0; i < 100; i++) {
                    //synchronized (test2) {
                    locker.lock();
                        Test2.addY();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //synchronized (test1){
                        locker.lock();
                            Test1.addX();
                        locker.unlock();
                        //}
                    locker.unlock();
                    //}

                }
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

        System.out.println(Test1.x);
        System.out.println(Test2.y);
    }

}
