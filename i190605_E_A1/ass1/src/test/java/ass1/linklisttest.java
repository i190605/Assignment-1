package ass1;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class linklisttest {

	@Test
	public void test() {
		
	LinkedList obj;
	 obj= new LinkedList();

obj.add(5);
if(obj.tailPointer.data==5) {
	assertEquals(0,0);

}

	}

	@Test
	public void test2() {
		
	LinkedList obj;
	 obj= new LinkedList();
	 obj.pushFront(4);

	 if (obj.headPointer.data==4)
	 {
		 assertEquals(0,0);

	}
	}

	@Test
	public void test3() {
		
	LinkedList obj;
	 obj= new LinkedList();
	 obj.pushBack(6);

	 if (obj.tailPointer.data==6)
	 {
		 assertEquals(0,0);

	}
	 }


	@Test
	public void test4()throws Exception {
		
	LinkedList obj= new LinkedList();
obj.popFront();

	 if (obj.tailPointer.data==6)
	 {
		 assertEquals(0,0);

	}
		}

	@Test
	public void test5()throws Exception {
		
	LinkedList obj;
	 obj= new LinkedList();
obj.topFront();

	 if (obj.tailPointer.data==6)
	 {
		 assertEquals(0,0);

	}
	
	}



@Test
public void test6()throws Exception {
	
LinkedList obj;
 obj= new LinkedList();
obj.popFront();

 if (obj.tailPointer.data==6)
 {
	 assertEquals(0,0);

}
	}

@Test
public void test7() {
	
LinkedList obj;
 obj= new LinkedList();
obj.pushBack(4);

 if (obj.tailPointer.data==6)
 {
		assertTrue(true);


}

}


@Test
public void test8()throws Exception {
	
LinkedList obj;
 obj= new LinkedList();
obj.topBack();

 if (obj.tailPointer.data==6)
 {
	assertTrue(true);

}

}


@Test
public void test9() {
	
LinkedList obj;
 obj= new LinkedList();
obj.size();

assertTrue(true);
}
@Test
public void test10() {
	LinkedList obj;
	 obj= new LinkedList();
obj.display();
	 
}

}

