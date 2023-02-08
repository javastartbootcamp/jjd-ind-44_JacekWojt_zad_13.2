import java.util.List;

public class ShowResults {

    static String reversShowResult(List<Integer> number) {
        String reversString = "";
        StringBuilder builder = new StringBuilder(reversString);
        for (Integer integer : number) {
            builder.append(integer + ", ");
        }
        reversString = builder.toString();
        String trimmedString = reversString.trim();
        StringBuilder buffer = new StringBuilder(trimmedString);
        buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }

    static String sumShowResult(List<Integer> number, int sumList) {
        String sumString = "";
        StringBuilder builder = new StringBuilder(sumString);
        for (Integer integer : number) {
            builder.append(integer + " + ");
        }
        sumString = builder.toString();
        StringBuilder buffer = new StringBuilder(sumString);
        buffer.deleteCharAt(buffer.length() - 1);
        buffer.deleteCharAt(buffer.length() - 1);
        String bufferedString = buffer.toString();
        return bufferedString + "= " + sumList;
    }
}
