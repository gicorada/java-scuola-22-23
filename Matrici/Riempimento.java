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
