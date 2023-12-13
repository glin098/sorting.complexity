public class InsertionSort extends Sort {
    private long counter;

    public InsertionSort() {
        counter = 0;
    }

    @Override
    public void sort(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int j = i;

            while (j > 0) {
                counter++;

                if (vector[j - 1] > vector[j]) {
                    swap(vector, j - 1, j);
                    counter += 3;

                    j--;
                } else {
                    break;
                }
            }
        }
    }

    @Override
    public long getCounter() {
        return counter;
    }
}
