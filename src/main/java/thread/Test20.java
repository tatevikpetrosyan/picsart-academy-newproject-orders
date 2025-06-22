package thread;

public class Test20 {
    public static void main(String[] args) throws InterruptedException {

        MyCustomThread thread1 = new MyCustomThread("thread 1");
        MyCustomThread thread2 = new MyCustomThread("thread 2");
        MyCustomThread thread3 = new MyCustomThread("thread 3");
        MyCustomThread thread4 = new MyCustomThread("thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.setPriority(10);
        thread4.setPriority(8);
        System.out.println(thread3.getPriority());

        System.out.println("My main function");
        thread1.join();
        System.out.println("My second main function");
        thread2.join();
        System.out.println("My third main function");
    }
}
