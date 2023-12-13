public class HeapSort extends Sort {
    private static long counter;
    
    public HeapSort() {
        counter=0;
    }
    
    @Override
    public void sort(int[] vector) {		

        int n = vector.length - 1;

        for (int i = vector.length / 2 - 1; i >= 0; i--) {
        
            counter += 2;
            heapify(vector, i);
        }

        while (n > 0) {
            swap(vector, 0, n--);
            shiftDown(vector, 0, n);
            
            counter += 2;
        }
	}

	private void heapify(int[] vector, int parent) {
		int left = 2 * parent + 1;
		int right = 2 * parent + 2;

        int maximum = parent;
        
        if (left < vector.length && vector[left] > vector[maximum]) {
            maximum = left;
        }
        if (right < vector.length && vector[right] > vector[maximum]) {
            maximum = right;
        }
        if (maximum != parent) {
        swap(vector, maximum, parent);
        heapify(vector, maximum);
        }
    }

	private void shiftDown(int[] vector, int parent, int last) {
		int left = 2 * parent + 1;
		int right = 2 * parent + 2;

		if (left <= last) {
			if (right <= last) {
				if (vector[left] > vector[right]) {
					if (vector[parent] < vector[left]) {
						swap(vector, parent, left);
						shiftDown(vector, left, last);
					}
                } else if (vector[parent] < vector[right]) {
                    swap(vector, parent, right);
                    shiftDown(vector, right, last);
                }
            } else if (vector[parent] < vector[left]) {
                    swap(vector, parent, left);
            }
        }
	}

    @Override
    public long getCounter() {
        return counter;
    }
    
}
