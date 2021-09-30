package arrays;


import java.util.Arrays;
import java.util.Comparator;

public class MoreArrays implements Comparator {

     public static void main(String[] args) {
        int result[][] = {{2, 3, 4, 2}, {7, 3, 9, 2}, {2, 2, 4, 4}, {8, 1, 4, 2}};
        Arrays.sort(result, new MoreArrays());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++)
                System.out.print( result[i][j] + " ");
            System.out.println(" ");

        }
    }
    public int compare(Object a, Object b) {
        int aa[] = (int[]) a;
        int bb[] = (int[]) b;
        for (int i = 0; i < aa.length && i < bb.length; i++)
            if (aa[i] != bb[i])
                return aa[i] - bb[i];
        return aa.length - bb.length;
    }
}


