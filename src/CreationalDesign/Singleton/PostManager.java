package src.CreationalDesign.Singleton;

public class PostManager {
    private DatabaseConnect connect;
    
    public PostManager() {
        connect = DatabaseConnect.getInstance(); 
    }
    
    public void getPost() {
        connect.query("SELECT * FROM posts");
    }
}
