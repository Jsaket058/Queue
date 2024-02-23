class Queue1{
	public static void main(String[] args){
		Queue s=new Queue();
		System.out.println(s.push(10));
		System.out.println(s.push(20));
		System.out.println(s.push(30));
		System.out.println(s.push(40));
		System.out.println(s.push(50));
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.push(5));
		System.out.println(s.push(6));
		System.out.println(s.push(7));
		System.out.println(s.push(8));
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.push(60));
		System.out.println(s.push(70));
		System.out.println(s.push(80));
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.top());
	}
}
class Queue{
	int front,rear,count;
	int A[]=new int[5];
	Queue(){
	front=-1;
	rear=-1;
	count=0;
	}
	boolean push(int x){
	if(count==5)return false;	
	if(front==-1){
		A[++front]=x;
		rear++;
		count++;
		return true;
	}
	++rear;
    A[rear%5]=x;
	count++;
    return true;	
	}
	
	int top(){
		if(isEmpty())return -1;
		return A[front%5];
	}
	
	int pop(){
		if(isEmpty())return -1;
		int y=A[front%5];
		A[front%5]=-1;
		front++;
		count--;
		return y;
	}
	boolean isEmpty(){
		if(count==0)return true;
		return false;
	}
}