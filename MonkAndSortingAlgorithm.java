//package gl.packageExample;

public class MonkAndSortingAlgorithm {

	
		// TODO Auto-generated method stub
		void merge(int arr[][], int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	  
	        /* Create temp arrays */
	        int L[][] = new int[2][n1];
	        int R[][] = new int[2][n2];
	  
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	            {L[0][i] = arr[0][l + i];L[1][i] = arr[1][l + i];}
	        for (int j = 0; j < n2; ++j)
	            {R[0][j] = arr[0][m + 1 + j];R[1][j] = arr[1][m + 1 + j];}
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	  
	        // Initial index of merged subarray array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[1][i] > R[1][j] )//||((L[1][i] == R[1][j])&&L[0][i] > R[0][j])) 
	            { arr[0][k] = R[0][j];
	                arr[1][k] = R[1][j];
	                j++;
	            }
	            else {
	                arr[0][k] = L[0][i];
	                arr[1][k]=	L[1][i];
	                i++;
	            }
	            k++;
	        }
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	        	arr[0][k] = L[0][i];
                arr[1][k] = L[1][i];
	            i++;
	            k++;
	        }
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	        	arr[0][k] = R[0][j];
                arr[1][k]=	R[1][j];
	            j++;
	            k++;
	        }
	      
	    }
	  
	    // Main function that sorts arr[l..r] using
	    // merge()
	    void sort(int arr[][], int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m =l+ (r-l)/2;
	  
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	  
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	  
	    /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	    // Driver code
	    public static void main(String args[])
	    {
	        int arr[][] = { {213456789,167890,123456789},{56789,67890,56789}};
	  
	        printArray(arr[0]);
	        printArray(arr[1]);
	  
	        MonkAndSortingAlgorithm ob = new MonkAndSortingAlgorithm();
	        ob.sort(arr, 0, arr[0].length - 1);
	  
	        System.out.println("\nSorted array");
	        printArray(arr[0]);
	        printArray(arr[1]);
	        
	    }
	}


