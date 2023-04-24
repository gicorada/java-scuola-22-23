/*
 * Copyright 2023 radaelli11353.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pile;

import java.util.Scanner;
import java.util.Stack;

/**
 * Classe effettua il riempimento a inondazione per riempire un array
 * @author radaelli11353
 */
public class Pile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] grid = new int[10][10];
        
        Stack<Pair> pairs  = new Stack<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                grid[i][j]=0;
            }
        }
        
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci posizione da cui iniziare flood fill (riga colonna): ");    
        pairs.push(new Pair(in.nextInt()-1, in.nextInt()-1));
        
        int counter = 1;
        
        while(!pairs.isEmpty()) {
            Pair actual = pairs.pop();
            int row = actual.getRow();
            int col = actual.getColumn();
            
            if(grid[row][col] == 0) {
                grid[row][col] = counter++;
            } 
            
            if(row - 1 >= 0 && grid[row-1][col] == 0) {
                pairs.push(new Pair(row-1, col));
            }

            if(row + 1 <= 9 && grid[row+1][col] == 0) {
                pairs.push(new Pair(row+1, col));
            }

            if(col - 1 >= 0 && grid[row][col-1] == 0) {
                pairs.push(new Pair(row, col-1));
            }

            if(col + 1 <= 9 && grid[row][col+1] == 0) {
                pairs.push(new Pair(row, col+1));
            }
        }
        
        for (int[] r : grid) {
            for (int e : r) {
                System.out.print(e  + "\t");
            }
            System.out.println("");
        }
        
    }
    
}
