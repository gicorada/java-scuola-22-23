package prodotti;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author giacomo
 */
public class ListaSpesa {
    public static void main(String[] args) {
        ArrayList<Prodotti> listaSpesa = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hai la tessera fedeltà?");
        boolean tessera = (in.next().equalsIgnoreCase(sì)) ? true : false;
        
        System.out.println("Inserisci il numero di prodotti");
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            String tipoProdotto = in.next().toLowerCase();
            if(tipoProdotto.equals("alimentari")) {
                System.out.println("Inserisci i dati del prodotto nel formato:\nCodiceBarre\ndescrizione\nprezzo\nscadenza");
                listaSpesa.add(new Alimentari(in.nextInt(), in.nextLine(), in.nextDouble(), new Date()));
            }
        }
        
        double prezzo;
        
        for(Prodotti p : listaSpesa) {
            prezzo += p.getPrezzo();
        }
    }
}
