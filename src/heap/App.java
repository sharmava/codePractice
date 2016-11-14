package heap;

public class App {
   public static void main(String[] args) {
	Heap heap = new Heap(10);
	
	heap.intsert(10);
	heap.intsert(100);
	heap.intsert(-10);
	
	heap.heapsort();
	
	System.out.println();
	
	System.out.println();
}
}
