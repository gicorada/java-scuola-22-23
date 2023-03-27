package date;

import java.util.ArrayList;

/**
 *
 * @author giacomo
 */
public class ProvaData {
    public static void main(String[] args) {
        ArrayList<DataFormattata> date = new ArrayList<>();
        
        date.add(new DataNumerica(5, 7, 2020));
        date.add(new DataEstesa(5, 7, 2020));
        date.add(new DataEstesa(10, 7, 2020));
        
        System.out.println(date.get(0).stringaFormattata());
        System.out.println(date.get(1).stringaFormattata());
        
        System.out.println(date.get(2).compareTo(date.get(1)));
    }
}
