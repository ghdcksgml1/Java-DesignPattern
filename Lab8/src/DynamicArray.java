import java.util.Iterator;
import java.util.NoSuchElementException;

// DataCollection을 implements하는 DynamicArray
public class DynamicArray<E> implements DataCollection<E>{
    private int length; // null이 아닌 배열의 길이
    private int capacity; // 배열의 용량
    private E[] data; // 제네릭의 배열형태

    // constructor
    public DynamicArray(){
        this.length = 0;
        this.capacity = 5;
        this.data = (E[]) new Object[capacity]; // DynamicArray객체가 생성될때 기본으로 capacity길이 만큼의 제네릭 배열을 생성함.
    }

    // 용량이 꽉찼을때, 데이터를 받아 추가해주는 코드
    private void copy(E data, int newCapacity){
        E[] new_data = (E[]) new Object[newCapacity];
        for(int i=0;i<newCapacity-1;i++){
            new_data[i] = this.data[i];
        }
        new_data[newCapacity-1] = data;
        this.data = new_data;
    }

    // 용량이 꽉찼을때, 데이터를 중간에 삽입해주는 코드
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

    // 배열을 맨뒤에 추가하는 메소드
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

    // 배열의 index에 해당 객체를 추가하는 메소드
    @Override
    public void insert(int index, E e) {
        // 객체를 추가했을때 배열의 길이가 용량보다 크면 동적으로 용량을 증가시킨다.
        if(length+1 >= capacity){
            System.out.println("동적으로 용량 증가");
            length++; capacity++;
            copy(index, e, capacity);
        }else{
            for(int i=length;i>index;i--){
                this.data[i] = this.data[i-1];
            }
            this.data[index] = e;
            length++;
        }
    }

    // 해당 인덱스의 객체를 제거시키는 메소드
    @Override
    public void remove(int index) {
        // 배열이 비어있을때에는 해당기능을 수행하지 않는다.
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

    // 해당 인덱스의 객체의 값을 가져온다.
    @Override
    public E elemAt(int index) {
        return this.data[index];
    }

    // 현재 배열의 길이를 반환한다.
    @Override
    public int length() {
        return data.length;
    }

    // 현재 저장되어있는 배열을 초기화시킨다.
    @Override
    public void clear() {
        E[] new_data = (E[]) new Object[5];
        this.data = new_data;
    }

    // Iterator 구현
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

    // iterator를 실행시킬때, DynamicArrayIterator의 구현을 실행한다.
    @Override
    public Iterator iterator() {
        return new DynamicArrayIterator<E>();
    }
}
