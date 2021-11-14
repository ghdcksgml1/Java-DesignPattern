import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListDataCollection<E> implements DataCollection<E>{
    private List<E> list;
    public ListDataCollection(List<E> list){
        this.list = list;
    }
    @Override
    public void put(E e) {
        list.add(e);
    }

    @Override
    public void insert(int index, E e) {
        list.add(index, e);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public E elemAt(int index) {
        return list.get(index);
    }

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    private class ListDataCollectionIterator<E> implements Iterator<E>{
        private int index=0;

        @Override
        public boolean hasNext() {
            return index < ListDataCollection.this.length();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (E) ListDataCollection.this.elemAt(index++);
        }

        @Override
        public void remove() {
            ListDataCollection.this.remove(--index);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ListDataCollectionIterator<E>();
    }
}
