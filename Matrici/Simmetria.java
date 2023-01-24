/*
    Copyright (C) 2023 Giacomo Radaelli

       Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

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
