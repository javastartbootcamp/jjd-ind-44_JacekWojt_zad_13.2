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
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    static int smallestNumberOfList(List<Integer> numbers) {
        int smallestElement = 100;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestElement) {
                smallestElement = numbers.get(i);
            }
        }
        return smallestElement;
    }

    static int highestNumberOfList(List<Integer> numbers) {
        int biggestElement = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > biggestElement) {
                biggestElement = numbers.get(i);
            }
        }
        return biggestElement;
    }
}
