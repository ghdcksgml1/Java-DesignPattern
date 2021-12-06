package template;

public class Sorter<T> {
    private Comparator<T> comparator; // strategyPattern이므로 comparator 멤버변수를 가지고 있음

    public Sorter(Comparator<T> comparator){
        this.comparator = comparator;
    }

    // comparator를 통한 버블 소트 구현
    public void bubbleSort(T[] data){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) {
                    swap(data, j, j + 1); // swap
                }
            }
        }
    }
    // swap
    public void swap (T[] data,int i, int j){
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
