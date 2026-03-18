public class HelloApp6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = "";

            // Enhanced for-loop
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", "
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }

    }
}