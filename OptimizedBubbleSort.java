public class OptimizedBubbleSort extends Sort {
    private static long counter;

    public OptimizedBubbleSort() {
        counter = 0;
    }

    @Override
    public void sort(int[] vector) {
        counter += 1;  // i=0
        boolean swapped;

        for (int i = 0; i < vector.length - 1; i++) {
            counter += 1;  // i<this.vector.length - 1
            counter += 1;  // j=0
            swapped = false;

            for (int j = 0; j < vector.length - i - 1; j++) {
                counter += 1;  // j<this.vector.length - i - 1
                counter += 1;  // this.vector[j] > this.vector[j+1]

                if (vector[j] > vector[j + 1]) {
                    Sort.swap(vector, j + 1, j);

                    counter += 3;  // 3 assignments to swap values
                    swapped = true;
                }

                counter += 1;  // j++
            }

            if (!swapped) {
                // If no swaps were made in this pass, the array is already sorted
                break;
            }

            counter += 1;  // j<this.vector.length
            counter += 1;  // i++
        }

        counter += 1; // i<this.vector.length
    }

    @Override
    public long getCounter() {
        return counter;
    }
}
