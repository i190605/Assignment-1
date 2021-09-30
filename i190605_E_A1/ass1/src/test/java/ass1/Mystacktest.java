package ass1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mystacktest {

	@Test
	public void test() throws Exception {
	
	 MyStack obj1;
	 int x=5;
	 obj1= new MyStack(x);
	 
	 obj1.push(5);
	 obj1.push(4);
	 obj1.push(3);
	 obj1.push(2);
	 obj1.push(1);
	 
	 if(obj1.arraytostoreStack[0]==5) {
		
		 assertEquals(0,0);

		 }
	 else
		 assertEquals(1,0);

	} 
	@Test
	public void test2() throws Exception {
	
	 MyStack obj1;
	 int x=5;
	 obj1= new MyStack(x);
	 obj1.push(5);
	 obj1.push(4);
	 obj1.push(3);
	 obj1.push(2);
	 obj1.push(1);
	 
	 obj1.top();
	 if(obj1.arraytostoreStack[4]==1) {
		
		 assertEquals(0,0);

		 }
	 else
		 assertEquals(1,0);

	} 
	@Test
	public void test3() throws Exception {
	
	 MyStack obj1;
	 int x=5;
	 obj1= new MyStack(x);
	 obj1.push(5);
	 obj1.push(4);
	 obj1.push(3);
	 obj1.push(2);
	 obj1.push(1);
	 
	 obj1.pop();
	 if(obj1.arraytostoreStack[4]==1) {
		
		 assertEquals(0,0);

		 }
	 else
		 assertEquals(1,0);

	} 

	@Test
	public void test4() throws Exception {
	
	 MyStack obj1;
	 int x=5;
	 obj1= new MyStack(x);
	 obj1.push(5);
	 obj1.push(4);
	 obj1.push(3);
	 obj1.push(2);
	 obj1.push(1);
	 
	 obj1.size();
	 if(obj1.topPointer+1==5) {
		
		 assertEquals(0,0);

		 }
	 else
		 assertEquals(1,0);

	} 


	@Test
	public void test5() throws Exception {
	
	 MyStack obj1;
	 int x=5;
	 obj1= new MyStack(x);
	 obj1.push(5);
	 obj1.push(4);
	 obj1.push(3);
	 obj1.push(2);
	 obj1.push(1);
	 
	 obj1.displayStack();
	 
	 

}

}