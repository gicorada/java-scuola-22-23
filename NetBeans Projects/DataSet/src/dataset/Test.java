/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.Random;

/**
 *
 * @author gicorada
 */
public class Test {
    public static void main(String[] args) {
        DataSet set = new DataSet(1);
        Random generator = new Random();
        
        for (int i = 0; i < 10000; i++) {
            set.add(generator.nextInt(1000) - 100);
        }
        
        System.out.println(set.max() + " " + set.min() + " " + set.media() + " " + set.scarto(set.media()) + " Raddoppi:" + set.getRaddoppi());
    }
}
