public class Scultura extends OperaDArte {
	private double larghezza;
	private double altezza;
	private double profondita;

	public Scultura(String titolo, String autore, double larghezza, double altezza, double profondita) {
		super(titolo, autore);

		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondita = profondita;
	}

	@Override
	public double ingombro() {
		return larghezza * altezza * profondita;
	}

	@Override
	public String toString() {
		return super.toString() + larghezza + "x" + altezza + "x" + profondita + "(l*h*p)";
	}

	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Scultura s = (Scultura) o;
		return larghezza == s.larghezza && altezza == s.altezza && profondita == s.profondita;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)larghezza + (int)altezza + (int)profondita;
	}
}	
