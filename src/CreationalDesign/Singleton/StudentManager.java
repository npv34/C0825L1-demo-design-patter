package src.CreationalDesign.Singleton;

public class StudentManager {
    private DatabaseConnect connect;
    
    public StudentManager() {
        connect = DatabaseConnect.getInstance(); 
    }
    
    public void getStudent() {
        connect.query("SELECT * FROM students");
    }
}
