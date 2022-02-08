package Binarysearch;

public class Binarysearch {

	public static void main(String[] args) {
		int searchItem = 18;
		Binarysearch obj = new Binarysearch();
		boolean status = obj.search(searchItem);
		System.out.println(status);

	}

	int[] arr = { 1, 3, 6, 7, 9, 14, 18, 22, 50 };
	public boolean search (int searchItem) {
	 boolean isFound =false;
	 int low=0;
	 int high=arr.length-1;
	 int mid =-1;
	 int itr=0;
	 while(low <= high) {
		 itr++;
	  mid =(low+high)/2;
	 int arrValue =arr[mid];
	 if (searchItem== arrValue) {
		 isFound=true;
		 break;
		  }else if(searchItem < arrValue) {
		 high = mid - 1;
 
	 }else
		 
	 
		 low=mid+1;
	 }
	 System.out.println(itr);
	  return isFound;
	 
}
}
	