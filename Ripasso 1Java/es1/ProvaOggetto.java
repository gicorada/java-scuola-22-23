public class ProvaOggetto { //classe da cui deriva l'oggetto in TestOggetto.java
	private int esempio = 1;

	public ProvaOggetto(){ //costruttore
		esempio = 5;
	}

	public ProvaOggetto(int inserito){ //costruttore con parametri (Costruttore parametrico completo)
		esempio = inserito;
	}

	public int getEsempio() { //getter per la variabile "esempio"
		return esempio;
	}
}