package template;

// Java21-2 Final (2021/12/06 Kyoung Shin Park)
public abstract class AbstractSorter<T> {

	final void bubbleSort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (compare(data[j], data[j + 1]) > 0) { 
                	swap(data, j, j + 1); // swap
                }
            }
        }
    }

    void swap(T[] data, int i, int j) {
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
    }

    abstract int compare(T o1, T o2);  
}
