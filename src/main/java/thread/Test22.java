package thread;

public class Test22 {

    public static void main(String[] args) throws InterruptedException {

        /* Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < a.length; i++) {
                    if (max < a [i]) {
                        max = a[i];
                }
            }
        }
    }); */

        Thread maxThread1 = new MyThread3("T1");

        System.out.println("Barev");
        System.out.println("Hello");

        maxThread1.start();
        maxThread1.join();
        System.out.println(MyThread3.max);
}
}
