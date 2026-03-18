public class HelloApp5 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for-loop (for-each)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }

    }
}