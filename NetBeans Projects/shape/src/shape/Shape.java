/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author gicorada
 */
public abstract class Shape implements Comparable<Shape> {
    private int w, h, x, y;
    
    public abstract int width();
    public abstract int height();
    public abstract int posX();
    public abstract int posY();
    
    @Override
    public int compareTo(Shape o) {
        return width()*height() - o.width()*o.height();
    }
}