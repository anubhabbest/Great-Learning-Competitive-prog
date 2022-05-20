//package gl.packageExample;

public class BinarySearch {
	static int search(int arr[],int low,int high,int key)
	{
		   while(low<=high)
		   {
		     int mid=(low+high)/2;
		     if(arr[mid]<key)
		     {
		         low=mid+1;
		     }
		     else if(arr[mid]>key)
		     {
		         high=mid-1;
		     }
		     else
		     {
		         return mid;
		     }
		   }
		   return -1;                //key not found
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(search(arr,0,arr.length-1,10));
	}

}
