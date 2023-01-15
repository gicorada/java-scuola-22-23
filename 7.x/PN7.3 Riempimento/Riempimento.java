
public class Riempimento {
	public static void main(String[] args) {
		boolean[] posti = {false, false, false, false, false, false, false, false, false, false};
		int occupati = 0;

		while (occupati < posti.length) {
			int centro = 0;
			int maxSequence = 0;
			int actSequence = 0;
			for (int i = 0; i < posti.length; i++) {
				if (!posti[i]) {
					actSequence++;
					if (actSequence > maxSequence) {
						maxSequence = actSequence;
						centro = i - actSequence / 2;
					}
				} else {
					actSequence = 0;
				}
			}
			posti[centro] = true;
			occupati++;

			for(int i = 0; i < posti.length; i++) {
				if(posti[i]) System.out.print("X");
				else System.out.print("_");
			}

			System.out.println();
		}

		
	}	
}