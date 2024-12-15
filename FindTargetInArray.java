import java.text.MessageFormat;

public class FindTargetInArray {
    public static void main(String[] args) {
        int[] numbers = {9, 2, 3, 4, 1, 4, 3, 4, 8};
        FindTargetInArray method = new FindTargetInArray();
        method.findTargetInArrayOne(7, numbers);
        method.findTargetInArrayTwo(7, numbers);
    }

    public void findTargetInArrayOne(int target, int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return;
        }

        boolean found = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentIndex = numbers[i];
            int nextIndex = numbers[i + 1];
            int resultAdding = currentIndex + nextIndex;

            if (resultAdding == target) {
                found = true;
                String formatPrint = MessageFormat.format(
                        "currentIndex {0} + nextIndex {1} == {2}",
                        currentIndex, nextIndex, resultAdding
                );
                System.out.println(formatPrint);
            }
        }

        if (!found) {
            System.out.println("No pair of adjacent elements in the array sums up to the target: " + target);
        }
    }

    public void findTargetInArrayTwo(int target, int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return;
        }

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            int tempNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int tempNumberIndexJ = numbers[j];
                if (tempNumber + tempNumberIndexJ == target) {
                    found = true;
                    String formatPrint = MessageFormat.format(
                            "tempNumber {0} + tempNumberIndexJ {1} == {2}",
                            tempNumber, tempNumberIndexJ, tempNumber + tempNumberIndexJ
                    );
                    System.out.println(formatPrint);
                }
            }
        }

        if (!found) {
            System.out.println("No pair of elements in the array sums up to the target: " + target);
        }
    }
}
