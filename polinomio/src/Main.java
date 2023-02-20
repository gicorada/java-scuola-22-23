public class Main {
    public static void main(String[] args) {
        double[] first = {1, 1, 1};
        double[] second = {-7, 0, 2};
        Polinomio p = new Polinomio(first);
        Polinomio p2 = new Polinomio(second);


        System.out.println(p);
        System.out.println(p2);

        System.out.println(new Polinomio(p2.add(p)));

        System.out.println(p.y(2));
    }
}