import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n or p)");
        String answer = in.nextLine();

        Double avg;

        if (answer.equalsIgnoreCase("n")) {
            avg = inputs.stream()
            .mapToInt(num -> Integer.valueOf(num))
            .filter(num -> num < 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the negative numbers: " + avg);

        } else {
            avg = inputs.stream()
            .mapToInt(num -> Integer.valueOf(num))
            .filter(num -> num > 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the positive numbers: " + avg);
        }
        in.close();
    }
}
