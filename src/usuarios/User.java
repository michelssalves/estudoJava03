package usuarios;

public class User {

    private String firstName;
    private String lastName;
    private boolean isLogged;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String fullName;

    public void setLogged(boolean logged){
        isLogged = logged;
    }
    public String getFullName(){

        return firstName + " " + lastName;
    }


}
