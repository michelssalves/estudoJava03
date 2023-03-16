import instrumentos.Instrumentos;
import usuarios.User;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

       /* User userA = new User();
        userA.setFirstName("Michel");
        System.out.println(userA.getFirstName());

        userA.setFirstName("MaYuumIII");
        System.out.println(userA.getFirstName());

        User [] users  = new User[10];
        for(int i = 0; i < users.length; i++){

            User actual = new User();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;
        }
        User [] users  = new User[]{
                new User("Michel", "Alves"),
                new User("Mayumi", "Alves"),
                new User("Rafaele", "Alves")

        };

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
*/
        List<User> users = new ArrayList<>();

        int i = 0;
        while (i <10){
            User actual = new User("Name "+i, "Sobrenome " +i);
            users.add(actual);
            i++;
        }

        System.out.println(users.get(9).getFirstName());
        System.out.println(users.get(9).getLastName());

        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }
}