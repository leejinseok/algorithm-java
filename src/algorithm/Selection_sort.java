package algorithm;

public class Selection_sort {
	
	public void sort1 (int[] data) {
		int size = data.length;
		int min;
		int temp;
		
		for (int i = 0; i < size; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}
			
			temp = data[i];
			data[i] = data[min];
			data[min] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		Selection_sort selection_sort = new Selection_sort(); 
		int[] data = {3,1,5,2,10};
		selection_sort.sort1(data);
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
