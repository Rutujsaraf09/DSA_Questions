
import java.io.*;
// import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);

            Solution ob = new Solution();
            System.out.println(ob.sumOfNaturals(n));
        }
    }
}
class Solution {
    public int sumOfNaturals(int n) {
        // code here
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i;
            if (sum>1000000007)
                sum=sum%1000000007;
            i++;
        }
        
        return sum;
    }
};