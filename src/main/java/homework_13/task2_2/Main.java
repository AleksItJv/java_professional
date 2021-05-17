package homework_13.task2_2;

public class Main implements Runnable {

    public static void main(String[] args) {
        Thread first = new Thread(new First2(), "first");
        Thread second = new Thread(new Second2(), "second");
        Main mn = new Main();
        mn.run();
        first.start();
        second.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //System.out.println(Thread.currentThread().getName() + "->" + i);
        }
        System.out.println("thread 'main' is close");
    }
}
/*Задержка потока.
Необходимо создать 3 потока, каждых из этих потоков запустить
 (например: main, second, first), и когда эти потоки успешно отработают
  – вывести на экран сообщение (завершение first, second и main).*/
