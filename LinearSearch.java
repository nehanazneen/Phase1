package LinearSearch;

public class LinearSearch {
	public static void main (String[] args) {
		int searchItem =1;
		LinearSearch demo = new LinearSearch();
		boolean status =demo.linearSearch(searchItem);
		if(status)
			System.out.println("Found");
		else 
			System.out.println("Not Found");
	}

	int[] arr = { 5, 8, 1, 6, 9, 3, 7, 2, 4 };

	public boolean linearSearch(int searchItem) {
	

	boolean isFound = false;
	int size = arr.length;
	System.out.println("The number of elemeents presrnt in an arrya is :"+size);
	for(int i = 0; i<size; i++){
	 int value = arr[i];
	 if (value ==searchItem) {
		 isFound =true;
		 break;
		 
	 }
 }

	return isFound;
}
}