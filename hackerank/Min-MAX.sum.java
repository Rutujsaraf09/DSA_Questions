package hackerank;

import java.io.*;
import java.util.*;

class Ans {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Calculate the sum of all integers in the array
        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the minimum and maximum sums
        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }
}

class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Ans.miniMaxSum(arr);

        bufferedReader.close();
    }
}
