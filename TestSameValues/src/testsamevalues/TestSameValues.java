/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testsamevalues;

/**
 *
 * @author gicorada
 */
public class TestSameValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dim = Integer.parseInt(args[0]);

        Elenco elenco = new Elenco(dim + 1);
        Elenco other = new Elenco(dim + 1);
        
        for(int i = 0; i <= dim; i++) {
            elenco.set(i, dim-i);
            other.set(i, dim-i);
        }
        
        /*long startTimeG = System.nanoTime();
        
        boolean giacomo = elenco.sameValuesGiacomo(other);
        
        long endTimeG = System.nanoTime();*/
        /*System.out.println("Giacomo: "  + giacomo);*/
        
        /*long timeElapsedG = endTimeG - startTimeG;*/
        /*System.out.println("Giacomo time: " + timeElapsedG + " ns");*/
        /*System.out.print(timeElapsedG);
        
        System.out.print(",");*/


        long startTimeS = System.nanoTime();
        
        boolean withSort = elenco.sameValuesSort(other);
        
        long endTimeS = System.nanoTime();
        /*System.out.println("Sort: "  + withSort);*/
        
        long timeElapsedS = endTimeS - startTimeS;
        /*System.out.println("Sort time: " + timeElapsedS + " ns");*/
        System.out.print(timeElapsedS);
        
        System.out.print(",");
        
        long startTimeP = System.nanoTime();
        
        boolean prof = elenco.sameValuesProf(other);
        
        long endTimeP = System.nanoTime();
        /*System.out.println("Prof: "  + prof);*/
        
        long timeElapsedP = endTimeP - startTimeP;
        /*System.out.println("Prof time: " + timeElapsedP + " ns");*/
        System.out.print(timeElapsedP);
        

        System.out.println("");
    }
    
}
