import instrumentos.Instrumentos;
import usuarios.User;


public class Main {
    public static void main(String[] args) {

        User userA = new User();
        userA.setFirstName("Michel");
        System.out.println(userA.getFirstName());

        userA.setFirstName("MaYuumIII");
        System.out.println(userA.getFirstName());

    }
}