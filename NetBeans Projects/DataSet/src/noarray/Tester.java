/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noarray;

/**
 *
 * @author gicorada
 */
public class Tester {
    public static void main(String[] args) {
        DataSet data = new DataSet(new MyMis(50));
        
        data.add(new MyMis(10));
        
        data.add(new MyMis(100));
        
        System.out.println(data.max().getMisura() + " " + data.min().getMisura() + " " + data.media() + " " + data.getScarto());
    }
}
