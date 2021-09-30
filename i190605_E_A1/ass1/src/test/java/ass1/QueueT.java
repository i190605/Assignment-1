package ass1;

import static org.junit.Assert.*;

import org.junit.Test;


public class QueueT {

	@Test
	public void test() {

Queue obj;
 obj= new Queue();
obj.enqueue(5);	
if(obj.head.key==5) {
	 assertEquals(0,0);

}
	}
	
/*
else
	 assertEquals(1,0);

	
 
	}
*/

	@Test
	public void test2() {

Queue obj;
 obj= new Queue();
	obj.enqueue(50);
	obj.enqueue(40);
	obj.enqueue(30);
	obj.enqueue(20);

	obj.dequeue();
	obj.dequeue();
	obj.display();

	
if(obj.head.key==30) {
	 assertEquals(0,0);

}
else
	 assertEquals(1,0);

	
 
	}

	@Test
	public void test3() {

		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.display();

	
 
	}

	//negative
	@Test
	public void test4() {


Queue obj;
 obj= new Queue();
	obj.enqueue(50);
	obj.enqueue(40);
	obj.enqueue(30);
	obj.enqueue(20);

	obj.dequeue();
	
	
if(obj.head.key==50) {
	 assertEquals(0,0);

}
else
	 assertEquals(1,0);

	
 
	}

	
 
	

	
}
