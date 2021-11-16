import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// DataCollection을 implements해서 List의 사용을 DataCollection과 같은 방법으로
// 사용하게 해주는 어댑터 클래스
public class ListDataCollection<E> implements DataCollection<E>{
    private List<E> list; // ArrayList와 Stack의 상위객체인 List로 객체를 관리한다.

    // constructor
    public ListDataCollection(List<E> list){
        this.list = list;
    }

    // DataCollection의 put은 List에서 add와 같다.
    @Override
    public void put(E e) {
        list.add(e);
    }

    // List에서 객체.add(index, 객체)를 통해 insert를 구현할 수 있다.
    @Override
    public void insert(int index, E e) {
        list.add(index, e);
    }

    // List의 객체 삭제는 DataCollection의 메소드명과 동일
    @Override
    public void remove(int index) {
        list.remove(index);
    }

    // elemAt은 List의 get으로 구현한다.
    @Override
    public E elemAt(int index) {
        return list.get(index);
    }

    // length는 List의 size()로 구현
    @Override
    public int length() {
        return list.size();
    }

    // clear 메소드명 역시 DataCollection과 동일
    @Override
    public void clear() {
        list.clear();
    }

    // Iterator
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

    // iterator를 실행시킬때, ListDataCollectionIterator 구현을 실행한다.
    @Override
    public Iterator<E> iterator() {
        return new ListDataCollectionIterator<E>();
    }
}
