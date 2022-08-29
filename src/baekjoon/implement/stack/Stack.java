package baekjoon.implement.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> implements StackInterface<E>{
	
	private static final int DEFAULT_CAPACITY = 10; // 최소 용적크기
	private static final Object[] EMPTY_ARRAY = {}; // 빈 배열
	
	private Object[] array; // 요소를 담을 배열
	private int size; // 요소 갯수
	
	//생성자(초기 공간 할당x)
	public Stack() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}
	
	//생성자(초기 공간 할당o)
	public Stack(int capacity) {
		this.array = new Object[capacity];
		this.size = 0;
	}
	
	private void resize() {
		
		if(Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}
		
		int arrayCapacity = array.length;
		
		if(size == arrayCapacity) {
			int newSize = arrayCapacity * 2;
			
			//배열 복사
			array = Arrays.copyOf(array, newSize);
			return;
		}
		
		if(size < (arrayCapacity /2)) {
			
			int newCapacity = arrayCapacity / 2;
			array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
			return;
		}
	}
	
	@Override
	public E push(E item) {
		if(size == array.length) {
			resize();
		}
		array[size++] = item;
		
		return item;
	}
	
	@Override
	public E pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		
		@SuppressWarnings("unchecked")
		E obj = (E) array[size - 1];
		
		array[size-1] = null; // 요소 삭제
		
		size--;
		resize();
		
		return obj;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		
		
		return (E) array[size - 1];
		
		
	}
	
	@Override
	public int search(Object value) {

		//value가 null일 경우 .equals(null)일 경우 NullpointerException 발생하니
		// ==비교를 해야한다
		if(value == null) {
			for(int idx = size - 1; idx >= 0; idx--) {
				if(array[idx] == value) {
					return size - idx;
				}
			}
		} else {
			for(int idx = size - 1; idx >= 0; idx--) {
				if(array[idx].equals(value)) {
					return size - idx;
				}
			}
		}
		return -1;
		
		
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void clear() {
		for(int i = 0; i < size; i++) {
			array[i] = null;
		}
		
		size = 0;
		resize();
	}
	
	@Override
	public boolean empty() {
		return size == 0;
	}

}
