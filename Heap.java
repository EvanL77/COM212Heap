//Evan Lyons
// 4/17/24
//Program 5 - Heap - creates an array that has the minimum node in the front. 
public class Heap
{
	private Node[] h = new Node[120];
	private int n = 0;
	
	public Heap(){
	
	}
	
	public boolean isEmpty(){
		return n ==0;
	}
	
	public Node findMin(){
		return h[0];
	}
	
	public void deleteMin(){//deletes first node in array and swaps nodes that are smaller
		h[0]=null;
		System.out.println("delete "+n);
		if(n!=1){
			for(int i = 0; i<n-1; i++){
				h[i]=h[i+1];
			}	
			//n--;
			if(h[0].getKey()>h[1].getKey()){
				checkDown(h[0],0);
			}
		}
		n--;

		
	}
	
	public void checkDown(Node x, int num){ //checks down the tree to see if node is less than 
		int p=(2*num)+1;
		if(h[num].getKey() > h[p].getKey()){
			swap((num),p);
			checkDown(h[p],p);
		}
	}
	
	public void insert(Node x){	//inserts node into array
		if(n==0){
			h[n]=x;
			n++;
			
		}
		else if(x.getKey()>h[n-1].getKey()){
			h[n]=x;
			n++;
			
		}
		else{
			h[n]=x;
			n++;
			checkUp(x,(n-1));

		}
	}
	public void checkUp(Node x,int num){	//checks up the tree to see if node above is less than 
		int p=(num-1)/2;
		//System.out.println(p);
		System.out.println("check");
		if(h[num].getKey() < h[p].getKey()){
			swap((num),p);
			checkUp(h[p],p);
			
		}
		/*
		else{
			
		}
		*/
	}
	
	public void swap(int x, int y){ //swaps nodes 
		System.out.println("swap");
		Node temp1=h[x];
		Node temp2=h[y];
		h[y]=temp1;
		h[x]=temp2;
		
	}
	public void traverse(){ //prints array as a list
		System.out.println(n);
		for(int i =0;i<=n-1;i++){
			System.out.println(i + ". "+h[i].getName()+" "+h[i].getKey());
		
		}
	}
	
	public void printHeap(){ //prints with parent and child nodes in tree form 
		for(int i=0; i<n-1;i++){
			System.out.println(h[i].getKey());
		
		if(h[(i*2)+1] != null) {
			System.out.println("left: "+ h[(i*2)+1].getKey());
			
		}
		else{
			System.out.println("Left: null");
		}
		if(h[(i*2)+2] !=null) {
			System.out.println("right: "+ h[(i*2)+2].getKey());
			
		}
		else{
			System.out.println("Right: null");
		}
	}
	}
		

}
