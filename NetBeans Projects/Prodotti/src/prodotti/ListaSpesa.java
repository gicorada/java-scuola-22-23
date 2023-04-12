package prodotti;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe di test per Prodotti
 * @author radaelli11353
 */
public class ListaSpesa {
    public static void main(String[] args) {
        ArrayList<Prodotti> listaSpesa = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        //Metodo provvisorio per sistemare la data in tutti gli Alimentari
        DataNumerica oggi = new DataNumerica(12, 2, 2023);
        Alimentari a = new Alimentari();
        a.setDate(oggi);
        
        
        System.out.print("Hai la tessera fedeltà? (S/n) ");
        boolean tessera = in.next().equalsIgnoreCase("s");
        
        System.out.print("Inserisci il numero di prodotti: ");
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            System.out.print("Alimentari (a) o non alimentari (n)? (a/n) ");
            char tipoProdotto = in.next().toLowerCase().charAt(0);
            if(tipoProdotto == 'a') {
                //System.out.println("Inserisci i dati del prodotto nel formato:\nCodiceBarre\ndescrizione\nprezzo\nscadenza");
                listaSpesa.add(new Alimentari(1234, "Prova alimentare", 10.00, new DataNumerica(10, 2, 2023)));
            } else if(tipoProdotto == 'n') {
                //System.out.println("Inserisci i dati del prodotto nel formato:\nCodiceBarre\ndescrizione\nprezzo\nmateriale principale");
                listaSpesa.add(new NonAlimentari(4321, "Prova non alimentare", 100.00, "vetro"));
            }
        }
        
        double prezzo = 0;
        
        System.out.println("Elementi nella lista:");
        for(Prodotti p : listaSpesa) {
            if(tessera) p.applicaSconto();
            prezzo += p.getPrezzo();
            System.out.println(p);
        }

        System.out.println("\n--- Prezzo finale: " + prezzo + "€ ---");
    }
}
