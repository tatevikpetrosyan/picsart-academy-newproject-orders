package synchron;

public class MyCustomThread5 extends Thread{
    private String name;

    MyCustomThread5 (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Test30.counter(name);
        }
    }

