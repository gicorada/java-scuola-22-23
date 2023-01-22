public class Identita {
    public static void main(String[] args) {
        int[][] matrice =
            {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
            };

        System.out.println(cercaIdentita(matrice));

    }

    private static boolean cercaIdentita(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                if(matrice[i][i] != 1) {
                    return false;
                }
                if(i != j && matrice[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
