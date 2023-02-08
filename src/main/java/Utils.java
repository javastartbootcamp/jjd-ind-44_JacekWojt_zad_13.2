import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<Integer> reversOrder(List<Integer> numbers) {
        List<Integer> reversList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            reversList.add(numbers.get(numbers.size() - i - 1));
        }
        return reversList;
    }

    static int sumList(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    static int smallestNumberOfList(List<Integer> numbers) {
        int smallestElement = 100;
        for (Integer number : numbers) {
            if (number < smallestElement) {
                smallestElement = number;
            }
        }
        return smallestElement;
    }

    static int highestNumberOfList(List<Integer> numbers) {
        int biggestElement = 0;
        for (Integer number : numbers) {
            if (number > biggestElement) {
                biggestElement = number;
            }
        }
        return biggestElement;
    }
}
