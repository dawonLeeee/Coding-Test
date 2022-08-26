package baekjoon.implement.arrayList;


public class ArrayList<T> {

	Object[] arr = null;
	int capacity = 0; // arr의 length
	int size = 0; // 현재 arr의 사이즈
	
	ArrayList(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
		size = 0;
	}
	
	ArrayList(){
		capacity = 1;
		arr = new Object[capacity];
		size = 0;
	}
	
	public void add(Object element) {
		if(size == capacity) {
			expandArray();
		}
		arr[size++] = element;
	}
	
	public void addFirst(Object element) {
		add(0, element);
	}
	
	public void add(int index, Object element) {
		if(size == capacity) {
			expandArray();
		}
		
		for(int i = size; i >= index; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[index] = element;
		size++;
	}
	
	private void expandArray() {
		capacity *= 2;
		Object[] tempArr = new Object[capacity];
		copyArr(tempArr, arr);
		arr = new Object[capacity];
		copyArr(arr, tempArr);
	}

	// arr2의 값을 복사해서 arr1에 넣는다
	private void copyArr(Object[] arr1, Object[] arr2) { 
		for(int i = 0; i < arr2.length; i++) {
			arr1[i] = arr2[i];
		}
	}
	
	public Object get(int index) {
		if(size <= 0) {
			System.out.println("배열이 비어있습니다.");
			return null;
		} else {
			return arr[index];
		}
	}
	
	public Object remove(int index) {
		
		T result = (T) arr[index];
		arr[index] = null;
		size--;
		
		if(size > 0) {
			for(int i = index; i < size; i++) {
				arr[i] = arr[i+1];
			}
		}
		return result;
	}
	
	public void reset() {
		arr = new Object[capacity];
	}
	
	public int size() {
		return this.size;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
}

