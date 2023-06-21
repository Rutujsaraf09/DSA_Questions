package hackerank;

import java.io.*;
import java.util.*;

class plusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

class Result {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            int value = arr.get(i);
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveProportion = (double) positiveCount / n;
        double negativeProportion = (double) negativeCount / n;
        double zeroProportion = (double) zeroCount / n;

        System.out.printf("%.6f%n", positiveProportion);
        System.out.printf("%.6f%n", negativeProportion);
        System.out.printf("%.6f%n", zeroProportion);
    }
}
