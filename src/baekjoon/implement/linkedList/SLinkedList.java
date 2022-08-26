package baekjoon.implement.linkedList;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class SLinkedList<E> implements List<E> {

	private Node<E> head; // 노드의 첫 부분
	private Node<E> tail; // 노드의 끝 부분
	private int size; // 요소 갯수

	
	// 생성자
	public SLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	private Node<E> search(int index) {
		
		// 범위 밖(잘못된 위치)일 경우 예외 던지기
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> x = head; // head가 가리키는 노드부터 시작
		
		for(int i = 0; i < index; i++) {
			x = x.next; // x노드의 다음 노드에 x를 저장한다
		}
		return x;
	}
	
	public void addFirst(E value) {
		
		Node<E> newNode = new Node<E>(value); // 새 노드 생성
		newNode.next = head; // 새 노드의 다음 노드로 head노드를 연결
		head = newNode;
		size++;
		
		// 다음에 가리킬 노드가 없는 경우( = 데이터가 새 노드밖에 없는 경우)
		// 데이터가 한 개(새 노드)밖에 없는 경우 tail = head
		if(head.next == null)
			tail = head;
		
	}
	
	@Override
	public boolean add(E value) {
		addLast(value);
		return true;
	}
	
	public void addLast(E value) {
		Node<E> newNode = new Node<E>(value); // 새 노드 생성
		
		if(size == 0) {
			addFirst(value);
			return;
		}
		
		// 마지막 노드(tail)의 다음 노드(next)가 새 노드를 가리키도록 하고
		// tail이 가리키는 노드를 새 노드로 바꿔준다
		tail.next = newNode;
		tail = newNode;
		size++;
		
	}
	
	@Override
	public void add(int index, E value) {
		// 잘못된 인덱스를 참조할 경우 예외 발생
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		//추가하려는 index가 가장 앞에 추가하려는 경우 addFist 호출
		if(index == 0) {
			addFirst(value);
			return;
		}
		//추가하려는 index가 가장 마지막 위치일 경우 addLast 호출
		if(index == size) {
			addLast(value);
			return;
		}
		
		//추가하려는 위치의 이전 노드
		Node<E> prev_Node = search(index - 1);
		
		// 추가하려는 위치의 노드
		Node<E> next_Node = search(index);
		
		Node<E> newNode = new Node<E>(value);
		
		// 이전 노드가 가리키는 노드를 끊은 뒤 새 노드로 변경
		// 또한 새 노드가 가리키는 노드는 next_Node로 설정
		prev_Node.next = null;
		prev_Node.next = newNode;
		newNode.next = next_Node;
		size++;
	}
	
	
	public E remove() {
		
		Node<E> headNode = head;
		
		if(headNode == null)
			throw new NoSuchElementException();
		
		// 삭제된 노드를 반환하기 위한 임시 변수
		E element = headNode.data;
		
		//head의 다음 노드
		Node<E> nextNode = head.next;
		
		//head노드의 데이터들을 모두 삭제
		head.data = null;
		head.next = null;
		
		//head가 다음 노드를 가리키도록 업데이트
		head = nextNode;
		size--;
		
		// 삭제된 요소가 리스트의 유일한 요소였을 경우 그 요소는 head이자 tail이었으므로
		// 삭제되면서 tail도 가리킬 요소가 없기 때문에 size가 0일 경우 tail도 null 반환
		if(size == 0) {
			tail = null;
		}
		
		return element;

	}
	
	@Override
	public E remove(int index) {
		
		if(index == 0) {
			return remove();
		}
		
		// 잘못된 범위에 대한 예외
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> prevNode = search(index - 1); // 삭제할 노드의 이전 노드
		Node<E> removeNode = prevNode.next; // 삭제할 노드
		Node<E> nextNode = removeNode.next; // 삭제할 노드의 다음 노드
		
		E element = removeNode.data;
		
		// 이전 노드가 가리키는 노드를 삭제하려는 노드의 다음 노드로 변경
		prevNode.next = nextNode;
		
		//만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 전환
		if(prevNode.next == null) {
			tail = prevNode;
		}
		
		// 데이터 삭제
		removeNode.data = null;
		removeNode.next = null;
		size--;
		

		return element;
	}
	
	@Override
	public boolean remove(Object value) {
		
		Node<E> prevNode = head;
		boolean hasValue = false;
		
		Node<E> x= head; // removedNode;
		for(; x != null; x = x.next) {
			if(value.equals(x.data)) {
				hasValue = true;
				break;
			}
			prevNode = x;
		}
		
		//일치하는 요소가 없을 경우 false 반환
		if(x == null)
			return false;
		
		//만약 삭제하려는 노드가 head라면 기존 remove()를 사용
		if(x.equals(head)) {
			remove();
			return true;
		} else {
			//이전 노드의 링크를 삭제하려는 노드의 다음 노드로 연결
			prevNode.next = x.next;
			
			//만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 갱신
			if(prevNode.next == null ) {
				tail = prevNode;
			}
		}
		x.data =  null;
		x.next = null;
		size--;
		return true;
	}
	
	@Override
	public E get(int index) {
		return search(index).data;
	}
	
	@Override
	public void set(int index, E value) {
		Node<E> replaceNode = search(index);
		replaceNode.data = null;
		replaceNode.data = value;
		
	}
	
	@Override
	public int indexOf(Object value) {
		int index = 0;
		
		for(Node<E> x = head; x != null; x =x.next) {
			if(value.equals(x.data)) {
				return index;
			}
			index++;
		}
		// 찾고자 하는 요소가 없을 때 -1 반환
		return -1;
		
	}
	
	@Override
	public boolean contains(Object item) {
		return indexOf(item) >= 0;
	}
	
	
	// 객체 자체를 null 해주기보다는 모든 노드를 하나하나 null해주는 것이 
	// 가비지컬렉터가 명시적으로 해당 메모리를 안쓴다고 인지하기 때문에 메모리 관리 측면에서 조금이나마 좋다
	@Override
	public void clear() {
		for(Node<E> x = head; x != null;) {
			Node<E> nextNode = x.next;
			x.data = null;
			x.next = null;
			x = nextNode;
		}
		head = tail = null;
		size = 0;
		
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	
	// 부가적인 메서도 : clone, toArray, sort 구현
	// 접근제어자가 protected로 되어 있어 사용자클래스의 경우 Clonable 인터페이스를 implement해야한다
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		SLinkedList<? super E> clone = (SLinkedList<? super E>) super.clone();
		
		clone.head = null;
		clone.tail = null;
		clone.size = 0;
		
		for(Node<E> x = head; x != null; x = x.next) {
			clone.addLast(x.data);
		}
		return clone();
	}

}
