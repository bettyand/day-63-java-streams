import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(Integer.valueOf(input));
        }

        List<Integer> posNums = positive(inputs);

        System.out.println("Here are the positive numbers you entered: " + posNums.toString());

        in.close();
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
            .filter(num -> num > 0)
            .collect(Collectors.toList());
    }
}
