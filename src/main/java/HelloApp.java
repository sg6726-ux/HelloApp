public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        int count = 0;

        for (String name : args) {

            nameBuilder.append(name);

            if (count < args.length - 1) {
                nameBuilder.append(", ");
            }

            count++;
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");

    }

}