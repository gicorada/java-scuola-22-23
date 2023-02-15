public class Main {
    public static void main(String[] args) {
        Robot test = new Robot();

        test.turnRight();
        test.move();
        test.move();
        test.move();
        test.move();
        test.turnRight();
        test.move();
        test.move();
        test.move();

        System.out.println(test.getDirection());
    }
}