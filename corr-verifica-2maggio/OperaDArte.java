public abstract class OperaDArte implements Comparable<OperaDArte> {
	private String titolo;
	private String autore;

	public OperaDArte(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}


	public abstract double ingombro();
	
	@Override
	public boolean equals(Object o) {
		if(o==null || o.getClass() != getClass()) return false;
		OperaDArte op = (OperaDArte) o;

		return titolo.equals(op.titolo) && autore.equals(op.autore);
	}
	
	@Override
	public int hashCode() {
		return titolo.hashCode() + autore.hashCode();
	}

	@Override
	public int compareTo(OperaDArte o) {
		return Double.compare(ingombro(), o.ingombro());
	}

	@Override
	public String toString() {
		return titolo + " di " + autore;
	}
}
