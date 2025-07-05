package synchron;

public class Test30 {
    public static void main(String[] args) {
        MyCustomThread5 custom1 = new MyCustomThread5("Thread1");
        MyCustomThread5 custom2 = new MyCustomThread5("Thread2");

        custom1.start();
        custom2.start();
    }

public synchronized static void counter(String name) {
    for (int i = 0; i < 10; i++) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Counter for " + name + " " + i);
    }
    }

}
