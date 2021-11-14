import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements DataCollection<E>{
    private int length;
    private int capacity;
    private E[] data;

    public DynamicArray(){
        this.length = 0;
        this.capacity = 5;
        this.data = (E[]) new Object[capacity];
    }

    // [추가코드] 용량이 꽉찼을때, 데이터를 받아 추가해주는 코드
    private void copy(E data, int newCapacity){
        E[] new_data = (E[]) new Object[newCapacity];
        for(int i=0;i<newCapacity-1;i++){
            new_data[i] = this.data[i];
        }
        new_data[newCapacity-1] = data;
        this.data = new_data;
    }

    // [추가코드] 용량이 꽉찼을때, 데이터를 중간에 삽입해주는 코드
    private void copy(int index, E data, int newCapacity){
        E[] new_data = (E[]) new Object[newCapacity];
        for(int i = 0; i < index; i++){
            new_data[i] = this.data[i];
        }
        new_data[index] = data;
        for(int i = newCapacity - 1; i > index; i--){
            new_data[i] = this.data[i-1];
        }
        this.data = new_data;
    }

    @Override
    public void put(E e) {
       if(length >= capacity){
           System.out.println("동적으로 용량 증가");
           length++; capacity++;
           copy(e, capacity);
       }else{
           data[length] = e;
           length += 1;
       }
    }

    @Override
    public void insert(int index, E e) {
        if(length >= capacity){
            System.out.println("동적으로 용량 증가");
            length++; capacity++;
            copy(index, e, capacity);
        }else{
            for(int i=length;i>index;i++){
                this.data[i] = this.data[i-1];
            }
            this.data[index] = e;
            length++;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= length) {
            System.out.println("배열이 비어있습니다.");
        }
        else {
            for (int i = index; i < length - 1; i++) {
                this.data[i] = this.data[i+1];
            }
            this.length--;
            this.data[length] = null;
        }
    }

    @Override
    public E elemAt(int index) {
        return this.data[index];
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public void clear() {
        E[] new_data = (E[]) new Object[5];
        this.data = new_data;
    }

    private class DynamicArrayIterator<E> implements Iterator<E>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < length;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (E) DynamicArray.this.elemAt(index++);
        }

        @Override
        public void remove() {
            DynamicArray.this.remove(--index);
        }
    }

    @Override
    public Iterator iterator() {
        return new DynamicArrayIterator<E>();
    }
}
