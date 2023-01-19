import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Studente> lista = new ArrayList<>();

        while(in.hasNextLine()) {
            Studente s = new Studente(in.next(), in.next(), in.nextDouble(), in.nextInt());
            insert(lista, s);
        }

        for (Studente s: lista) {
            System.out.println(s.toString());
        }
    }

    private static void insert(ArrayList<Studente> l, Studente s) {
        if(l.size() == 0) {
            l.add(s);
        } else {
            boolean ins = false;
            for(int i = 0; i < l.size(); i++) {
                if(s.compareTo(l.get(i)) < 0) {
                    l.add(i, s);
                    ins = true;
                    break;
                }
            }
            if(!ins) {
                l.add(s);
            }
        }
    }
}
