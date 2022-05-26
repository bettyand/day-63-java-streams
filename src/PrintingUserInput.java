import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Enter some strings. Enter an empty line to stop.");

        while (true) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("You entered:");
        inputs.stream()
            .forEach(str -> System.out.println(str));

        in.close();
    }
}