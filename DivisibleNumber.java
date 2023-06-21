import java.io.*;

class DivisibleNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            long A = Long.parseLong(S[0]);
            long B = Long.parseLong(S[1]);
            System.out.println(Solution.find(A, B));
        }
    }
}

class Solution {
    static long find(long A, long B) {
        for (long i = A + 1; ; i++) {
            if (i % B == 0)
                return i;
        }
    }
}
