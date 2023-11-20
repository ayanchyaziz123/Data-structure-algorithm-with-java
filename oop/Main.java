// Encapsulation: User class with private fields and public getters/setters
class User {
    private int userId;
    private String username;
    private String email;

    // Constructor
    public User(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    // Getter and Setter methods
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Inheritance: PremiumUser class extending User
class PremiumUser extends User {
    private boolean isPremium;

    // Constructor
    public PremiumUser(int userId, String username, String email, boolean isPremium) {
        super(userId, username, email);
        this.isPremium = isPremium;
    }

    // Additional method specific to PremiumUser
    public void accessPremiumContent() {
        System.out.println(getUsername() + " is accessing premium content!");
    }
}

// Polymorphism: Printer interface with print method
interface Printer {
    void print();
}

// Two classes implementing the Printer interface
class TextPrinter implements Printer {
    public void print() {
        System.out.println("Printing text...");
    }
}

class ImagePrinter implements Printer {
    public void print() {
        System.out.println("Printing image...");
    }
}

// Abstraction: Shape abstract class with an abstract method
abstract class Shape {
    abstract double calculateArea();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to run the application
public class Main {
    public static void main(String[] args) {
        // Encapsulation example
        User user = new User(1, "JohnDoe", "john@example.com");
        System.out.println("User: " + user.getUsername());

        // Inheritance and Polymorphism example
        PremiumUser premiumUser = new PremiumUser(2, "PremiumUser", "premium@example.com", true);
        premiumUser.accessPremiumContent();

        // Polymorphism example with Printer interface
        Printer textPrinter = new TextPrinter();
        textPrinter.print();

        Printer imagePrinter = new ImagePrinter();
        imagePrinter.print();

        // Abstraction example with Shape class
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
