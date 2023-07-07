import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solut().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
        sc.close();
} }

class Solut
{
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr,p+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j)
      {
        while(arr[i]<=pivot && i<high){
            i++;
        }
        while(arr[j]>pivot && j>low){
            j--;
        }
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
      }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
      return j;
    } 
};