package algorithm;

public class BubbleSort {
	public void sort (int[] arr) {
		int len = arr.length;
		int temp = 0;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = {5,3,4,2,1};

		bubbleSort.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
