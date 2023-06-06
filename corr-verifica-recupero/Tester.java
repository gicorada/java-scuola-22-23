public class Tester {
    public static void main(String[] args) {
        Filiale f = new Filiale();

        f.add(new ContoCorrente(1000));
        f.add(new ContoDeposito(500, 10));
        f.add(new ContoIntestato(1500, "Test"));

        f.add(new ContoIntestato(2001, "quello da rimuovere"));
        f.remove(4);

        System.out.println(f);

    }
}
