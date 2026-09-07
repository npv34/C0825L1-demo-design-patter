package src.CreationalDesign.Singleton;

public class DatabaseConnect {
    private static int count = 0;
    private static DatabaseConnect instance;
    // de trong private de khong ai tu y tao ket noi duoc
    private DatabaseConnect() {
        System.out.println("Tao ket noi den csdl");
        count++;
    }

    public void query(String sql) {
        System.out.println("Thuc thi truy van: " + sql);
    }

    public static int getCount() {
        return count;
    }

    public static DatabaseConnect getInstance() {
        if (instance == null) {
            instance = new DatabaseConnect();
        }
        return instance;
    }
}
