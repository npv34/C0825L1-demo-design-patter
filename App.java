import src.CreationalDesign.Factory.OrderService;
import src.CreationalDesign.Singleton.DatabaseConnect;
import src.CreationalDesign.Singleton.PostManager;
import src.CreationalDesign.Singleton.StudentManager;
import src.CreationalDesign.Singleton.UserManager;

public class App {
     public static void main(String[] args) {
        // OrderService orderService = new OrderService();
        // orderService.processOrder("COD", 100);
        // orderService.processOrder("VNPAY", 200);
        // orderService.processOrder("ZALO", 300);

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        PostManager postManager = new PostManager();
        userManager.getUser();
        studentManager.getStudent();
        postManager.getPost();

        
        System.out.println("So lan tao ket noi: " + DatabaseConnect.getCount());
    }
}