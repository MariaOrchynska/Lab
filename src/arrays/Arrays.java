package arrays;

import java.util.ArrayList;

public class Arrays {
    public void sortArray() {
        int[] numbers = {3, 4, 6, 8, 9, 10};
        int[] numbers2 = {5, 6, 6, 7, 8, 12};
        int n = numbers.length;
        int n2 = numbers2.length;
        int result[] = new int[n + n2];
        System.arraycopy(numbers, 0, result, 0, n);
        System.arraycopy(numbers2, 0, result, n, n2);
        System.out.println("Merged arrays: "+ java.util.Arrays.toString(result));
//        java.util.Arrays.sort(result);
        System.out.println("Result  symbol by symbol: ");
        System.out.println(java.util.Arrays.toString(result));
        System.out.println("Each character in different arr : ");
        for (int i = 0;i< result.length; i++){
            System.out.print(java.util.Arrays.toString(new int[]{result[i]}));
        }

    }
}
