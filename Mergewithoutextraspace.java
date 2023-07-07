
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(br.readLine().trim());

            long arr1[] = new long[n];
            long arr2[] = new long[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Long.parseLong(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Long.parseLong(inputLine[i]);
            }
            Solutio ob = new Solutio();
            ob.merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}

class Solutio {
    public void merge(long arr1[], long arr2[], int n, int m) {
        int i = 0, j = 0, k = 0;
        long arr3[] = new long[n + m];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        j = 0;
        for (int s = 0; s < arr3.length; s++) {
            if (s < n) {
                arr1[s] = arr3[s];
            } else {
                arr2[j] = arr3[s];
                j++;
            }
        }
    }
}