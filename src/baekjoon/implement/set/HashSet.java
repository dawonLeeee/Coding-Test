package baekjoon.implement.set;

public class HashSet<E> implements Set<E>{
	
	private final static int DEFAULT_CAPACITY = 1 << 4;
	
	// 3/4 이상 채워질 경우 resize하기 위함
	private final static float LOAD_FACTOR = 0.75f;
	
	Node<E>[] table; // 요소의 정보를 담고 있는 Node를 저장할 Node타입 배열
	private int size; // 요소의 갯수
	
	@SuppressWarnings("unchecked")
	public HashSet() {
		table = (Node<E>[])new Node[DEFAULT_CAPACITY];
		size = 0;
	}
	
	// 보조 해시 함수(상속 방지를 위해 private static final 선언)
	private static final int hash(Object key) {
		int hash;
		if(key == null)
			return 0;
		else
			// hashCode()의 경우 음수가 나올 수 있으므로 절댓값을 통해 양수로 변환해준다
			return Math.abs(hash = key.hashCode()) ^ (hash >>> 16);
	}

}
