/**
 * Classe che simula un poligono
 * @author radaelli11353
 */
public class Polygon {
    public final int MAX_DIM;
    private double[] x;
    private double[] y;
    private int actualDim;
    
    /**
     * Costruttore
     * @param dim Dimensione massima dell'array
     * @param x0 X del primo punto
     * @param y0 Y del primo punto
     */
    public Polygon(int dim, double x0, double y0) {
        MAX_DIM = dim;
        x = new double[MAX_DIM];
        y = new double[MAX_DIM];
        actualDim = 0;
        this.add(x0, y0);
    }
    
    /**
     * Metodo che aggiunge un punto al poligono
     * @param xn X del nuovo punto da inserire
     * @param yn Y del nuovo punto da inserire
     */
    public void add(double xn, double yn) {
        if(actualDim >= MAX_DIM) throw new IllegalArgumentException("Il numero massimo di vertici è stato raggiunto (" + MAX_DIM + ")");
        x[actualDim] = xn;
        y[actualDim] = yn;
        actualDim++;
    }
    
    /**
     * Metodo che calcola il perimetro del poligono
     * @return Perimetro del poligono
     */
    public double perimeter() {
        double dx, dy;
        double perimeter = 0;
        for(int i = 0; i < actualDim; i++) {
            if(i != actualDim - 1) {
                dx = x[i] - x[i+1];
                dy = y[i] - y[i+1];
            } else {
                dx = x[i] - x[0];
                dy = y[i] - y[0];
            }
            
            perimeter += Math.sqrt(dx*dx + dy*dy);
        }
        return perimeter;
    }
    
    /**
     * Metodo che restituisce l'area del poligono
     * @return Area del poligono
     */
    public double area() {
        double sum = 0;
        for(int i = 0; i < actualDim - 1; i++) {
            sum += x[i] * y[i+1];
        }
        sum += x[actualDim - 1] * y[0];
        for(int i = 0; i < actualDim - 1; i++) {
            sum -= y[i] * x[i+1];
        }
        sum -= y[actualDim - 1] * x[0];

        return sum/2;
    }
    
    /**
     * Metodo toString della classe
     * @return Stringa contenente i vertici del poligono
     */
    @Override
    public String toString() {
        String text = "Punti: ";
        for(int i = 0; i < actualDim; i++) {
            text += x[i] + "," + y[i] + "; ";
        }
        return text;
    }
}