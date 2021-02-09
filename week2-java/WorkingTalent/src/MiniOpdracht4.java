import java.util.Arrays;
import java.util.Random;

public class MiniOpdracht4 {
	void start() {
		int[] randomArray = createRandomArray();
		System.out.println("Random Array: " + Arrays.toString(randomArray));
		
		int[] sortedArray = sort(randomArray);
		System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
	}
	
	int[] createRandomArray() {
		int[] array = new int[10];
		for (int i = 0; i<10; i++) {
			Random rand = new Random();
			array[i] = rand.nextInt(200);
		}		
		return array;
	}
	
	int[] sort(int[] array) {
		int[] sortedArray = new int[10];
		int indexOfSmallest = 0;
		
		for (int i=0; i < array.length; i++) {
			indexOfSmallest = findSmallestIndex(array);
			sortedArray[i] = array[indexOfSmallest];
			array[indexOfSmallest] = 999999;			
		}	
		return sortedArray;
	}
	
	int findSmallestIndex(int[] array) {
		int indexOfSmallest = 0;
		int smallestValue = 9999999;
		for (int i=0; i < array.length; i++) {
			int value = array[i];
			if(value < smallestValue) {
				indexOfSmallest = i;
				smallestValue = value;
			}
		}
		return indexOfSmallest;
	}
}
