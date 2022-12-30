/**
 Classe che simula un set di dati
 @author radaelli11353
 */
public class DataSet {
    private double somma = 0;
    private int valori = 0;
    private double min = Double.MAX_VALUE;
    private double max = Double.MIN_VALUE;
    
    /**
     Costruttore della classe
    */
    public DataSet() {
        
    }
    
    /**
     Metodo che aggiunge il valore ai valori presenti nel set.
     Aggiorna le variabili min e max
     @param value Valore inserito
    */
    public void add(double value) {
        valori++;
        somma += value;
        
        min = Math.min(min, value);
        max = Math.max(max, value);
    }
    
    /**
     Metodo getter della somma dei valori
     @return Somma dei valori presenti nel set
    */
    public double getSum() {
        return somma;
    }
    
    /**
     Metodo getter per la media dei valori
     @return Media dei valori presenti nel set
    */
    public double getAverage() {
        return (double)somma/valori;
    }
    
    /**
     Metodo getter per il valore maggiore
     @return Valore maggiore presente nel set
    */
    public double getLargest() {
        return max;
    }
    
    /**
     Metodo getter per il valore minore
     @return Valore minore presente nel set
    */
    public double getSmallest() {
        return min;
    }

    public double getRange() {
        return max - min;
    }
}