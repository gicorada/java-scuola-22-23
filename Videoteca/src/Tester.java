public class Tester {
    public static void main(String[] args) {
        Videoteca myVideoteca = new Videoteca();

        myVideoteca.addVideogioco(new Videogioco("Test1", "Nintendo", "Switch", 5));
        myVideoteca.addVideogioco(new Videogioco("Test2", "Microsoft", "Switch", 100));

        System.out.println(myVideoteca.trova("Nintendo", 1));
        System.out.println(myVideoteca.trova("Nintendo").toString());
    }
}
