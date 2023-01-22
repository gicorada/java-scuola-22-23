import java.util.Random;

public class Riempimento {
    public static void main(String[] args) {
        int[][] matrice = new int[5][5];

        riempiRandom(matrice, 100);

        for (int[] array : matrice) {
            for(int num : array) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    public static void riempiRandom(int[][] matrice, int maxValue) {
        Random generator = new Random();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = generator.nextInt(maxValue);
            }
        }
    }
}
