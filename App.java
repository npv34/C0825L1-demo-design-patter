import src.CreationalDesign.Builder.Student;
import src.CreationalDesign.Builder.User;
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

        // UserManager userManager = new UserManager();
        // StudentManager studentManager = new StudentManager();
        // PostManager postManager = new PostManager();
        // userManager.getUser();
        // studentManager.getStudent();
        // postManager.getPost();

        
        // System.out.println("So lan tao ket noi: " + DatabaseConnect.getCount());
        // User u = new User.UserBuilder()
        //         .setFirstName("Luan")
        //         .setLastName("Nguyen")
        //         .setEmail("[EMAIL_ADDRESS]")
        //         .setCountry("Vietnam")
        //         .build();


        // User u2 = new User();

        Student s = new Student();
        s.setName("Luan");
        s.setAge(20);
        s.setMajor("Computer Science");
        s.setGpa("3.5");
        s.setAddress("Ha Noi");
        s.setCity("Ha Noi");
        s.setState("Ha Noi");
        s.setZip("123456");
        s.setCountry("Vietnam");

        s.setName("Quan");
        

        
    }
}