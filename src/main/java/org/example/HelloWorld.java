
public class HelloWorld {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String result = "Hello, ";

            // Add all names with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

            // Add exclamation mark
            result += "!";

            System.out.println(result);
        }
    }
}