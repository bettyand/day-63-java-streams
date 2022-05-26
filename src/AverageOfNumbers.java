import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("input numbers, type 'end' to stop.");

        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(input);
        }

        double average = inputs.stream()
            .mapToInt(num -> Integer.valueOf(num))
            .average()
            .getAsDouble();

        System.out.println("Average of your numbers: " + average);

        in.close();
    }
}
