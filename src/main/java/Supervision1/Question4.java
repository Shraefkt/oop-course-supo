package Supervision1;

import java.util.Arrays;

public class Question4 {
    public static int sum(int[] a) {
        int count = 0;
        for (int i = 0; i< a.length; i++) {
            count += a[i];
        }
        return count;
    }
    public static int[] cumsum(int[] a) {
        int cumsumcnt[] = new int[a.length];
        cumsumcnt[0] = a[0];
        for (int i = 1; i< a.length; i++) {
            cumsumcnt[i] = cumsumcnt[i-1] + a[i];
        }
        return cumsumcnt;
    }
    public static int[] positives(int[] a) {

        int no_pos =0;
        for (int j: a) {
            if (j >= 0) no_pos +=1;
        }
        int posarr[] = new int[no_pos];
        int i =0;
        for (int j: a) {
            if (j >= 0) posarr[i++] = j;
        }
        return posarr;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4}));
        System.out.println(Arrays.toString(cumsum(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(positives(new int[]{-11,-2,3,-4,5,6})));
    }
}
