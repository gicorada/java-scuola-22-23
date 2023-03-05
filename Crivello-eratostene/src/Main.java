import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Crivello test = new Crivello(100);

        test.setaccia();

        System.out.println(Arrays.toString(test.getResults()));
    }
}