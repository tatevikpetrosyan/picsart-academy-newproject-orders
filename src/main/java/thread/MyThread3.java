package thread;

public class MyThread3 extends Thread {
    private String name;

    MyThread3(String name) {
        this.name = name;
    }

    static int[] a = {4, 3, -7, 0, 78, 9};
    static int max = a[0];

    @Override
    public void run() {
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
    }
}
