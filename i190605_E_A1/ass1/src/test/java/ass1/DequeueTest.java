package ass1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueTest {

	@Test
	public void test() {

		Dequeue Obj1;
		int x=5;
	Obj1=new Dequeue(x);
	Obj1.addLeft(5);
if(Obj1.leftPointer==5)	
	{
	assertTrue(true);
	}
	}
	
	@Test
	public void test2() {

		Dequeue Obj1;
		int x=5;
	Obj1=new Dequeue(x);
	Obj1.addRight(5);
if(Obj1.rightPointer==5)	
	{
	assertEquals(0,0);
	
	}
	}
	

	@Test
	public void test3() {
		int x=5;

		Dequeue Obj1;
		Obj1=new Dequeue(x);

		Obj1.display();
	
	

}

	

}
