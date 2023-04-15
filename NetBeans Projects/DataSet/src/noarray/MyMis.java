/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noarray;

/**
 *
 * @author gicorada
 */
public class MyMis implements Misurabile {
    private double misura;

    public MyMis(double misura) {
        this.misura = misura;
    }
    
    @Override
    public double getMisura() {
        return misura;
    }
    
}
