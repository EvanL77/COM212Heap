//Evan Lyons 3/7/2024
//program class Zero (Node)
//This class creates a node with name and SSN and pointer next. 
public class Node
{
	private String name;
	private int ssn;
	private Node next;
	
	public Node(String name1, int num1)
	{
		name = name1;
		ssn = num1;
		next = null;
	}
	
	public void setSSN(int input)
	{
		ssn = input;
	}
	
	public void setName(String input1)
	{
		name = input1;
	}
	
	public int getSSN()
	{
		return ssn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getKey()
	{
		return ssn%10000;
	}
	
	public void setNext(Node nextNode)
	{
		next = nextNode;
	}
	
	public Node getNext()
	{
		return next;
	}
	
}
