package functional_interface;

public class Test35 {
    public static void main(String[] args) {


        Run run = (name, speed) -> {
            System.out.println("running " + name + " " + speed);
            System.out.println("running fast");
        };


        run.fast("Tatev", 70);
        run.fast("Ani", 90);
    }
}
