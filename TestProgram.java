import java.util.Random;

public class TestProgram {


	public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        
        return array;
    }
    
    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        
        return array;
	}

	public static void main(String[] args) {
		// test(15);
		int[] sizes = {1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072};
        
        for (int size : sizes) {
            int[] randomArray = generateRandomArray(size);
            int[] sortedArray = generateSortedArray(size);
            
			/* 
			// Bubble Sort
            BubbleSort bubbleSort = new BubbleSort();
            
            // Test with random unsorted array
            bubbleSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Bubble Sort (unsorted): ");
            System.out.println(bubbleSort.getCounter());
            
            // Test with sorted array
            bubbleSort.sort(sortedArray);
			System.out.println("Bubble Sort (sorted): ");
            System.out.print(bubbleSort.getCounter());

			*/
	
			/* 
			HeapSort heapSort = new HeapSort();
            
            // Test with random unsorted array
            heapSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Heap Sort (unsorted): ");
            System.out.println(heapSort.getCounter());
            
            // Test with sorted array
            heapSort.sort(sortedArray);
			System.out.println("Heap Sort (sorted): ");
            System.out.print(heapSort.getCounter());
			*/

			/* 
			InsertionSort insertionSort = new InsertionSort();
            
            // Test with random unsorted array
            insertionSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Insertion Sort (unsorted): ");
            System.out.println(insertionSort.getCounter());
            
            // Test with sorted array
            insertionSort.sort(sortedArray);
			System.out.println("Insertion Sort (sorted): ");
            System.out.print(insertionSort.getCounter());
			*/

			/* 
			SelectionSort selectionSort = new SelectionSort();
            
            // Test with random unsorted array
            selectionSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Selection Sort (unsorted): ");
            System.out.println(selectionSort.getCounter());
            
            // Test with sorted array
            selectionSort.sort(sortedArray);
			System.out.println("Selection Sort (sorted): ");
            System.out.print(selectionSort.getCounter());
			*/

			/* 
			MergeSort mergeSort = new MergeSort();
            
            // Test with random unsorted array
            mergeSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Merge Sort (unsorted): ");
            System.out.println(mergeSort.getCounter());
            
            // Test with sorted array
            mergeSort.sort(sortedArray);
			System.out.println("Merge Sort (sorted): ");
            System.out.print(mergeSort.getCounter());
			*/

			/* 
			LomutosQuickSort lomutosQuickSort = new LomutosQuickSort();
            
            // Test with random unsorted array
            lomutosQuickSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Lomuto's Quick Sort (unsorted): ");
            System.out.println(lomutosQuickSort.getCounter());
            
            // Test with sorted array
            lomutosQuickSort.sort(sortedArray);
			System.out.println("Lomuto's Quick Sort (sorted): ");
            System.out.print(lomutosQuickSort.getCounter());
			*/

			/* 
			HoareQuickSort hoareQuickSort = new HoareQuickSort();
            
            // Test with random unsorted array
            hoareQuickSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Hoare's Quick Sort (unsorted): ");
            System.out.println(hoareQuickSort.getCounter());
            
            // Test with sorted array
            hoareQuickSort.sort(sortedArray);
			System.out.println("Hoare's  Quick Sort (sorted): ");
            System.out.print(hoareQuickSort.getCounter());
            */

            /* 
			OptimizedBubbleSort optimizedBubbleSort = new OptimizedBubbleSort();
            
            // Test with random unsorted array
            optimizedBubbleSort.sort(randomArray);
            
            System.out.println("\nRandom Array of Size " + size);
			System.out.println("Optimized Bubble Sort (unsorted): ");
            System.out.println(optimizedBubbleSort.getCounter());
            
            // Test with sorted array
            optimizedBubbleSort.sort(sortedArray);
			System.out.println("Optimized Bubble Sort (sorted): ");
            System.out.print(optimizedBubbleSort.getCounter());
            */

			
		}	
	}
}