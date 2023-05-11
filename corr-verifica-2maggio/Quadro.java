public class Quadro extends OperaDArte {
	private double larghezza;
	private double altezza;

	public Quadro(String titolo, String autore, double larghezza, double altezza) {
		super(titolo, autore);
		this.larghezza = larghezza;
		this.altezza = altezza;
	}

	@Override
	public double ingombro() {
		return larghezza * altezza;
	}

	@Override
	public String toString() {
		return super.toString() + larghezza + "x" + altezza + "(l*h)";
	}

	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Quadro q = (Quadro) o;
		return larghezza == q.larghezza && altezza == q.altezza;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)larghezza + (int)altezza;
	}	
}
