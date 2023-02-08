import java.util.List;

public class ShowResults {

    static String reversShowResult(List<Integer> number) {
        String reversString = "";
        StringBuilder builder = new StringBuilder(reversString);
        for (int i = 0; i < number.size(); i++) {
            builder.append(number.get(i) + ", ");
        }
        reversString = builder.toString();
        String trimmedString = reversString.trim();
        StringBuffer buffer = new StringBuffer(trimmedString);
        buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }

    static String sumShowResult(List<Integer> number, int sumList) {
        String sumString = "";
        StringBuilder builder = new StringBuilder(sumString);
        for (int i = 0; i < number.size(); i++) {
            builder.append(number.get(i) + " + ");
        }
        sumString = builder.toString();
        StringBuffer buffer = new StringBuffer(sumString);
        buffer.deleteCharAt(buffer.length() - 1);
        buffer.deleteCharAt(buffer.length() - 1);
        String bufferedString = buffer.toString();
        return bufferedString + "= " + sumList;
    }
}
