package init;
import login.Login;

public class Main {
    public static void main(String[] args){
        Login login = new Login();
        String passwordDB = "1";
        String nameDB = "Maksym";
        login.login(nameDB,passwordDB);

    }

}

