//package sorting.algorithms;

public abstract class Sort implements ISort {

	protected static void swap(int[] vector, int p, int q) {
	    int tmp;
	    
	    tmp = vector[p];
	    vector[p] = vector[q];
	    vector[q] = tmp;
	}

	@Override
	public abstract void sort(int[] vector);

}