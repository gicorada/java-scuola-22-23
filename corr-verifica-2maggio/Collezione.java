import java.util.ArrayList;

public class Collezione {
	private String nome;
	private ArrayList<OperaDArte> opere;

	public Collezione(String nome) {
		this.nome = nome;
		opere = new ArrayList<>();
	}

	public void addOpera(OperaDArte o) {
		opere.add(o);
	}

	@Override
	public String toString() {
		return nome + "{" + opere.toString() + "}";
	}
}
