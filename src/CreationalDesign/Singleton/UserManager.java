package src.CreationalDesign.Singleton;

public class UserManager {
    private DatabaseConnect connect;

    public UserManager() {
        connect = DatabaseConnect.getInstance(); 
    }

    public void getUser() {
        connect.query("SELECT * FROM users");
    }
}
