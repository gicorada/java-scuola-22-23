import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        ArrayList<Appointment> agenda= new ArrayList<>();

        agenda.add(new OneTime("Dentista", 24, 3, 22));

        System.out.println(agenda.toString());
        System.out.println(agenda.get(0).occursOn(24, 3, 22));
    }
}
