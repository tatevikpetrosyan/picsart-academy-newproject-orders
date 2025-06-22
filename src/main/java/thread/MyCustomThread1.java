package thread;

public class MyCustomThread1 implements Runnable {

    private String name;

    MyCustomThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Running from thread " + name);
        }
    }
}
