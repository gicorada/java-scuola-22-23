public class Main {
    public static void main(String[] args) {
        LoginForm login = new LoginForm("nametest", "pswtest");

        login.input("nametest");
        login.input("pswtest");

        login.click("Submit");

        System.out.println("Accesso: " + login.loggedIn());
    }
}