public class LomutosQuickSort extends Sort {

    private long counter;

    public LomutosQuickSort() {
        counter = 0;
    }

    private int partition(int[] vector, int low, int high) {
        int pivot = vector[high];

        int p = low;

        for (int q = low; q < high; q++) {
            counter++;

            if (vector[q] < pivot) {
                swap(vector, p, q);
                counter++;
                p++;
            }
        }

        swap(vector, p, high);
        counter++;

        return p;
    }

	private void sort(int[] vector, int low, int high) {
		if (low < high) {
			int p = partition(vector, low, high);
	
			// Sort elements before and after the pivot
			sort(vector, low, p - 1);
			sort(vector, p + 1, high);
		}
	}
	

    @Override
    public void sort(int[] vector) {
        sort(vector, 0, vector.length - 1);
    }

    @Override
    public long getCounter() {
        return counter;
    }
}
