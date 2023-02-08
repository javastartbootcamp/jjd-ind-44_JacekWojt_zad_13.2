import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Co najmniej 1 liczba powinna być większa od 0.");
            return;
        }
        while (number > 0) {
            numberList.add(number);
            System.out.println("Podaj kolejną liczbę: ");
            number = scanner.nextInt();
        }
        List<Integer> reversOrder = Utils.reversOrder(numberList);
        int sumList = Utils.sumList(numberList);
        System.out.println(ShowResults.reversShowResult(reversOrder));
        System.out.println(ShowResults.sumShowResult(numberList, sumList));
        System.out.println("Najmniejsza liczba w liście to " + Utils.smallestNumberOfList(numberList));
        System.out.println("Największa liczba w liście to " + Utils.highestNumberOfList(numberList));
    }
}

