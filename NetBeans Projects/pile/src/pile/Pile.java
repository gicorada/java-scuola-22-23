package pile;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author giacomo
 */
public class Pile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] grid = new int[10][10];//Pair array to insert in the stack
        
        Stack<Pair> pairs  = new Stack<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){ //to fill up the array
                grid[i][j]=0;
            }
        }
        
        Scanner sc = new Scanner(System.in);
        int row, column;
        row=sc.nextInt();
        column=sc.nextInt();
        
        pairs.push(new Pair(row, column));
        
        int counter = 1;
        
        while(!pairs.isEmpty()) {
            Pair actual = pairs.pop();
            
            if(grid[actual.getRow()][actual.getColumn()] != 0) {
                grid[actual.getRow()][actual.getColumn()] = counter++;
            }
            
            if(grid.length != actual.getRow()-1 && grid[actual.getRow()-1][actual.getColumn()] == 0) {
                pairs.push(new Pair(actual.getRow()-1, actual.getColumn()));
            }
            
            if(grid[actual.getRow()+1][actual.getColumn()] == 0) {
                pairs.push(new Pair(actual.getRow()+1, actual.getColumn()));
            }
            
            if(grid[actual.getRow()][actual.getColumn()-1] == 0) {
                pairs.push(new Pair(actual.getRow(), actual.getColumn()-1));
            }
            
            if(grid[actual.getRow()][actual.getColumn()+1] == 0) {
                pairs.push(new Pair(actual.getRow(), actual.getColumn()+1));
            }
        }
        
        for (int[] r : grid) {
            for (int i : r) {
                System.out.print(i  + "\t");
            }
            System.out.println("");
        }
        
    }
    
}
