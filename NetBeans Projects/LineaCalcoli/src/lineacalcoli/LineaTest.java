package lineacalcoli;

/**
 *
 * @author radaelli11353
 */
public class LineaTest {
    public static void main(String[] args) {
        Line prova = new Line(2, 3);
        Line other = new Line(2, 5);
        
        System.out.println(prova.intersects(other));
        
        
        System.out.println(prova);
    }
}
