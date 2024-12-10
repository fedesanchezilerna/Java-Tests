package debugger;

public class FindMax {
    public static void main(String[] args) {
        FindMax p = new FindMax();
        int[] numbers = {10, 50, 20, 30, 40};

        int max = p.findMax(numbers);
        System.out.println("Maximum = " + max);
    }

    private int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        return max;
    }
}
