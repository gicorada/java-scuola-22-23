public class Simmetria {
    public static void main(String[] args) {
        int[][] matrice =
        {
            {1, 2, 3, 4, 5},
            {2, 1, 4, 5, 6},
            {3, 4, 1, 6, 7},
            {4, 5, 6, 1, 8},
            {5, 6, 7, 8, 1}
        };

        for (int[] array : matrice) {
            for(int num : array) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }

        boolean simmetrico = true;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                if (matrice[i][j] != matrice[j][i]) simmetrico = false;
            }
        }

        if(simmetrico) {
            System.out.println("La matrice è simmetrica rispetto alla diagonale principale");
        } else {
            System.out.println("La matrice non è simmetrica");
        }
    }
}
