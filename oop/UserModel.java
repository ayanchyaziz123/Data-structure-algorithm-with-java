public class UserModel {
    // Private instance variables to represent user attributes
    private int id;
    private String userName;
    private String email;
    private String password;

    // Constructor to initialize the UserModel object with provided values
    UserModel(int id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    // Setter method for setting the user ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for retrieving the user ID
    public int getId() {
        return this.id;
    }

    // Setter method for setting the user's username
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter method for retrieving the user's username
    public String getUserName() {
        return this.userName;
    }

    // Setter method for setting the user's email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for retrieving the user's email
    public String getEmail() {
        return this.email;
    }

    // Setter method for setting the user's password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter method for retrieving the user's password
    public String getPassword() {
        return this.password;
    }
}
