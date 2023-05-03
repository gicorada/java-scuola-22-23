/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author gicorada
 */
public class Tester {
    public static void main(String[] args) {
        Shape c1 = new Circle(2, 3, 1);
        Shape c2 = new Circle(2, 3, 1);
        
        System.out.println(c1.posX() + ", " +c1.posY());
        System.out.println(c1.width() + ", " +c1.height());
        System.out.println(c1.equals(c2));
        
        ((Circle) c2).setRadius(2);
        System.out.println(c2.posX() + ", " + c2.posY());
    }
    
    
}
