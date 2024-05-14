//Evan Lyons
//4/17/24
//Tests the heap functions. 

public class TestHeap{
	public static void main(String[] args){
		Heap a = new Heap();
		System.out.println("Is heap empty = "+a.isEmpty());	
		Node xNode = new Node("Jack", 123456789);
        	Node yNode = new Node("Phil", 934567890);
       		Node zNode = new Node("Joe", 223452234);
        	Node kNode = new Node("Tim", 934567856);
        	Node aNode = new Node("Frank", 123451788);
        	a.insert(xNode);
        	a.insert(yNode);
        	a.insert(zNode);
        	a.insert(kNode);
        	a.insert(aNode);
        	a.traverse();
       		a.printHeap();
        	System.out.println("Min = "+ a.findMin().getKey());
        	a.deleteMin();
        	a.deleteMin();
        	a.traverse();
       		a.printHeap();
        	System.out.println("Min = "+ a.findMin().getKey());
        	a.deleteMin();
        	a.deleteMin();
        	a.deleteMin();
        	System.out.println("Is heap empty = "+a.isEmpty());	
	}
}
