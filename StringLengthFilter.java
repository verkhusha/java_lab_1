import java.util.ArrayList;
import java.util.List;

public class StringLengthFilter {

    public static String[] shorterThanAverage(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        double averageLength = calculateAverageLength(strings);
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.length() < averageLength) {
                result.add(str);
            }
        }

        return result.toArray(new String[0]);
    }


    public static String[] longerThanAverage(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        double averageLength = calculateAverageLength(strings);
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > averageLength) {
                result.add(str);
            }
        }

        return result.toArray(new String[0]);
    }


    private static double calculateAverageLength(String[] strings) {
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.length;
    }

    public static void main(String[] args) {
        String[] input = {"a", "bb", "ccc", "d", "eeeee"};

        System.out.println("Вхідний масив:");
        printArray(input);

        String[] shorter = shorterThanAverage(input);
        System.out.println("\nРядки коротші за середню:");
        printArray(shorter);

        String[] longer = longerThanAverage(input);
        System.out.println("\nРядки довші за середню:");
        printArray(longer);
    }

    private static void printArray(String[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}