package arrays;


import java.util.Arrays;

public class MoreArrays {
    public void sortMoreArrays() {
        int result [][]= {{2,3,4,2} ,{7,3,9,2},{2,2,4,4},{8,1,4,2}};
        Arrays.stream(result).sorted();
        System.out.println(Arrays.toString(result));
        for (int i : result[0]) {
            System.out.println();

        }


    }
}