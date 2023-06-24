package hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Answer {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;

        for (int height : candles) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }

        return count;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Answer.birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
