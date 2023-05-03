/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author gicorada
 */
public class Circle extends Shape {
    private int xc, yc, r;

    public Circle(int xc, int yc, int r) {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }
    
    public void setRadius(int r) {
        this.r = r;
    }

    @Override
    public int width() {
        return r*2;
    }

    @Override
    public int height() {
        return r*2;
    }

    @Override
    public int posX() {
        return xc - r;
    }

    @Override
    public int posY() {
        return yc - r;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.xc;
        hash = 59 * hash + this.yc;
        hash = 59 * hash + this.r;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Circle c = (Circle) o;
        return (xc == c.xc && yc == c.yc) && r == c.r;
    }
}
