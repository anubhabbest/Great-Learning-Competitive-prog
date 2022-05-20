//package gl.packageExample;

public class QuickSort {

	static int partition(int []arr,int low,int high)
	{
		int pivot=arr[high];
		int i=low-1,temp;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return(i);
	}
	
	static void sort(int []arr,int low,int high)
	{	
		int pivot;
		if(low<high)
		{
			pivot=partition(arr,low,high);
			partition(arr,low,pivot-1);
			partition(arr,pivot+1,high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,9,7,4,3,4};
		sort(arr,0,arr.length-1);
		for(int i : arr)
			System.out.print(i+" ");
	}

}
