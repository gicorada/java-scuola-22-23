package lineacalcoli;

/**
 *
 * @author radaelli11353
 */
public class Line {
    private double a;
    private double b;
    private double c;
    
    /**
     * Costruttore per linea con punto e pendenza
     * @param x1 X del punto fornito
     * @param y1 Y del punto fornito
     * @param m Pendenza
     */
    public Line(double x1, double y1, double m) {
        a = -m;
        b = 1;
        c = y1 - m * x1;
    }
    
    /**
     * Costruttore per linea passante per due punti
     * @param x1 X del primo punto
     * @param y1 Y del primo punto
     * @param x2 X del secondo punto
     * @param y2 Y del secondo punto
     */
    public Line(double x1, double y1, double x2, double y2) {
        a = (y2 - y1)/(x1 - x2);
        b = 1;
        c = (x2 * y1 - x1 * y2) / (x1 - x2);
    }
    
    /**
     * Costruttore per linea con pendenza e intersezione con y
     * @param m Pendenza
     * @param q Intersezione con l'asse delle y
     */
    public Line(double m, double q) {
        a = -m;
        b = 1;
        c = -q;
    }
   
    /**
     * Costruttore per retta verticale
     * @param k Costante che indica l'intersezione con x
     */
    public Line(double k) {
        a = 1;
        b = 0;
        c = -k;
    }

    @Override
    public String toString() {
        return a + "," + b + "," + c;
    }
    
    /**
     * Metodo che controlla se c'è intersezione tra due rette (=non parallele)
     * @param other Altra retta
     * @return True se c'è intersezione, false se sono parallele
     */
    public boolean intersects(Line other) {
        return !isParallel(other);
    }
    
    /**
     * Metodo che confronta l'uguaglianza tra due rette
     * @param other Altra retta
     * @return True se le rette sono uguali (sovrapposte)
     */
    public boolean equals(Line other) {
        return a == other.a && b == other.b && c == other.c;
    }
    
    /**
     * Metodo che controlla se le rette sono parallele
     * @param other Altra retta
     * @return True se sono parallele, false se c'è intersezione
     */
    public boolean isParallel(Line other) {
        double thisM = -a / b;
        double otherM = -other.a / other.b;
        
        return thisM == otherM;
    }
}
