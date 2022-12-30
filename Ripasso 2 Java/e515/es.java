public class es {
    public static void main(String[] args) {
        int reddito = 1000000;
        int perc;

        if (reddito < 50000) perc = 1;
        else if (reddito < 75000) perc = 2;
        else if (reddito < 100000) perc = 3;
        else if (reddito < 250000) perc = 4;
        else if (reddito < 500000) perc = 5;
        else perc = 6;

        System.out.println("Da pagare: " + (reddito*perc/100));
    }
}