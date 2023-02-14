public class LoginForm {
    private String username;
    private String password;
    private int state;

    public LoginForm(String username, String password) {
        this.username = username;
        this.password = password;
        state = 0;
    }

    public void input(String text) {
        if(state > 1) return;
        if(state == 0 && username == text) state++;
        if(state == 1 && password == text) state++;
    }

    public void click(String button) {
        if(state == 2) {
            if(button == "Submit") state++;
            if(button == "Reset") state = 0;
        }
    }

    public boolean loggedIn() {
        return state == 3;
    }
}
