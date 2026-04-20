
public class HelloWorld {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Join all names with comma
            String names = String.join(", ", args);

            // Print final output
            System.out.println("Hello, " + names + "!");
        }
    }
}