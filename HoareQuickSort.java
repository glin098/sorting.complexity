public class HoareQuickSort extends Sort {
    private static long counter;

	public HoareQuickSort() {
        counter=0;
    }

    private static int partition(int[] vector, int low, int high) {
        int pivot = vector[low]; 
        int p = low - 1;
        int q = high + 1;

        while (true) {
            counter++;

            do {
                p++;
                counter++;
            } while (vector[p] < pivot);

            do {
                q--;
                counter++;
            } while (vector[q] > pivot);

            if (p >= q) {
                counter++;
                return q;
            }

            swap(vector, p, q);
            counter++;
        }
    }

    private static void sort(int[] vector, int low, int high) {
        if (low < high) {
            int p = partition(vector, low, high);
            sort(vector, low, p);
            sort(vector, p + 1, high);
        }
    }

    @Override
    public void sort(int[] vector) {
        counter = 0; 
        sort(vector, 0, vector.length - 1);
    }

    @Override
    public long getCounter() {
        return counter;
    }
}
