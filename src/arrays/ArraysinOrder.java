package arrays;

import java.util.Arrays;

public class ArraysinOrder {
    int[] numbers = {3, 4, 6, 8, 9, 10};
    int[] numbers2 = {5, 6, 6, 7, 8, 12};
    int n = numbers.length;
    int n2 = numbers2.length;
    int sum1[] = new int[n + n2];

    public void arr() {
        System.arraycopy(numbers, 0, sum1, 0, n);
        System.arraycopy(numbers2, 0, sum1, n, n2);

        for (int i = 0; i < sum1.length; i++) {
            for (int j = i + 1; j < sum1.length; j++) {
                int tmp = 0;
                if (sum1[i] > sum1[j]) {
                    tmp = sum1[i];
                    sum1[i] = sum1[j];
                    sum1[j] = tmp;
                }


            }
            System.out.println(sum1[i]);

//        }
        }
    }
}
