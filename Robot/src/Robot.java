import java.awt.Point;

/**
 * State = 0 -> verso su
 * State = 1 -> verso destra
 * State = 2 -> verso il basso
 * State = 3 -> verso sinistra
 */
public class Robot {
    private int state;
    private Point pos;

    public Robot() {
        state = 0;
        pos = new Point();
    }

    public void turnLeft() {
        if(state == 0) state = 3;
        else state--;
    }

    public void turnRight() {
        if(state == 3) state = 0;
        else state++;
    }

    public void move() {
        if(state == 0) pos.translate(0, 1);
        else if(state == 1) pos.translate(1, 0);
        else if(state == 2) pos.translate(0, -1);
        else pos.translate(-1, 0);
    }

    public Point getLocation() {
        return pos;
    }

    public String getDirection() {
        if(state == 0) return "N";
        else if(state == 1) return "E";
        else if(state == 2) return "S";
        else return "W";
    }
}
