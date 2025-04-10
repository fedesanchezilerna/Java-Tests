package extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {

    public static boolean exists(int[] ints, int k) {
        int left = 0;
        int right = ints.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ints[mid] == k)
                return true;
            else if (ints[mid] < k)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static int countPeaks(List<Double> values) {
        int peakCount = 0;
        int n = values.size();

        if (values.size() < 3) return 0;

        for (int i = 1; i < n - 1; i++) { // Avoid 1st and last element, need data (prev-curr-next) to evaluate if they are peak
            double prev = values.get(i - 1);
            double curr = values.get(i);
            double next = values.get(i + 1);

            if ((curr >= prev + 5 && curr >= next + 5) ||
                (curr <= prev - 5 && curr <= next - 5)) {
                peakCount++;
            }
        }
        return peakCount;
    }

    public static int calculateTotalPrice(int[] prices, int discount) {
//        if (prices == null || prices.Length == 0) {
//            return 0; // No hay productos, el precio total es 0
//        }

        if (prices == null || prices.length == 0) return 0;

        // Encontrar el producto más caro
//        int maxPrice = prices.Max();
        int maxPrice = Arrays.stream(prices).max().orElse(0);

        // Calcular el monto del descuento correctamente, asegurando redondeo hacia abajo
        int discountAmount = (maxPrice * discount) / 100; // División de enteros en C# trunca automáticamente

        // Calcular el precio total con el descuento aplicado
        //int totalPrice = prices.Sum() - discountAmount;
        int totalPrice = Arrays.stream(prices).sum() - discountAmount;

        return totalPrice;
    }

    public static int solveConveyorBelt(int weight0, int weight1, int weight2) {
        int maxIndex = 0;
        int maxWeight = weight0;

        if (weight1 > maxWeight) {
            maxWeight = weight1;
            maxIndex = 1;
        }
        if (weight2 > maxWeight) {
            maxWeight = weight2;
            maxIndex = 2;
        }
        return maxIndex;
    }

    public static int findLargest (List<Integer> numbers) {
        int max = numbers.get(0);
        // int max2 = Collections.max(numbers);

        for (Integer number : numbers) {
            if (number > max) max = number;
        }

        return max;
    }
}
