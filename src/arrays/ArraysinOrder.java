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


        }
    }

    public static void sorted(int arr1[],int arr2[],int arr3[],int a1,int a2){
        int i=0;
        int s=0;
        int k=0;
        while (i<a1 && s <a2) {
            if (arr1[i] < arr2[s])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[s++];
        }
        while (i < a1)
            arr3[k++] = arr1[i++];

        while (s < a2)
            arr3[k++] = arr2[s++];
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 8, 9, 10};
        int[] arr2 = {5, 6, 6, 7, 8, 12};
        int a1= arr1.length;
        int a2=arr2.length;
        int []arr3=new int[a1+a2];
        sorted(arr1,arr2,arr3,a1,a2);
        System.out.println("The result : ");
        for (int i=0; i < a1+a2; i++)
            System.out.print(arr3[i] + " ");
    }



}

