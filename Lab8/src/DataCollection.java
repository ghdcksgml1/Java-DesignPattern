public interface DataCollection<E> extends Iterable<E> {
    void put(E e);
    void insert(int index, E e);
    void remove(int index);
    E elemAt(int index);
    int length();
    void clear();
}
