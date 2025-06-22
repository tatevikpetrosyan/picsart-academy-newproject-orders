package thread;

public class Test21 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyCustomThread1("thread 1"));
        Thread thread2 = new Thread(new MyCustomThread1("thread 2"));


        thread1.start();
        thread2.start();

        System.out.println("My main function");
        thread1.join();
        System.out.println("My second main function");
        thread2.join();
        System.out.println("My third main function");
    }
}
