public class SelectionSort extends Sort {
    private long counter;

    public SelectionSort() {
        counter = 0;
    }

    @Override
    public void sort(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            int p = i;

            for (int j = i + 1; j < vector.length; j++) {
                counter++;

                if (vector[j] < vector[p]) {
                    p = j;
                }
            }

            if (p != i) {
                swap(vector, i, p);
                counter++;
            }
        }
    }

    @Override
    public long getCounter() {
        return counter;
    }
}
