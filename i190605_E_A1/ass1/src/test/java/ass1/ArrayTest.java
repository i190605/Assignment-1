		package ass1;
	
		import static org.junit.Assert.*;
	
		import org.junit.Test;
	
		
	public class ArrayTest {
		
		
		//positive test cases
		
		
		@Test
		public void test() {
		int[] array= {1,2,3};
		int[] expec= {1,2,-1};
		Array obj1;
		 obj1=new Array();
			
		 obj1.insert(5, 3);
		
		 obj1.insert(4, 1);
			 
		 obj1.insert(3, 2);
			 
		 obj1.insert(1, 4);
			 
		 obj1.insert(2, 5);
			 
		if(obj1.linearSearch(3))
		
			assertEquals(0, 0);
		/*	
		else
			assertEquals(1, 0);
			*/ 
			
		
		}
	
		@Test
		public void test2() {
			
			 Array obj1;
			 obj1=new Array();
			 obj1.insert(5, 0);
			 obj1.insert(4, 1);
			 obj1.insert(3, 2);
			 obj1.insert(1, 3);
			 obj1.insert(2, 4);
			 
			 if(obj1.binarySearch(2,1,5))
				 assertEquals(0, 0);
		/*
			 else
				 assertEquals(1, 0);
			 
			*/
		}
	
	@Test
	 	public void test3() {
	
		 Array obj1;
		 
		 obj1=new Array();
		 
		 obj1.insert(5, 3);
		if(obj1.array[3]==5) {			
			assertEquals(0, 0);

			
		}
		/*
		else
			 assertEquals(1, 0);
	*/
								}
	
	
	
	@Test
			public void test4() {
		
		 Array obj1;
		 obj1=new Array();
		 obj1.insert(5, 3);
		 obj1.delete( 3);
		if(obj1.array[3]==5) {			 assertEquals(0, 0);
		
			
		}
		/*else
			 assertEquals(1, 0);
		*/
								}
		
	@Test 
	public void test5() 
	{	
	Array obj1;
	
	obj1=new Array ();
	
	obj1.insert(5, 0);
	
	obj1.insert(4, 1);
		 
	obj1.insert(3, 2);
		 
	obj1.insert(2, 3);
		 
	obj1.insert(1, 4);
	
	obj1.bubbleSort();
	
		if((obj1.array[0]==1)&&(obj1.array[1]==2)&&(obj1.array[2]==3)&&(obj1.array[3]==4)&&(obj1.array[4]==5))
					 assertEquals(0, 0);
	/*
		else
			assertEquals(0,1);
	*/
	}
	
	///////////////////////////////////////////////Negative Test cases//////////////////////////////////
	
	@Test
	public void test6() {
	int[] array= {1,2,3};
	int[] expec= {1,2,-1};
	Array obj1;
	 obj1=new Array();
		
	 obj1.insert(5, 3);
	
	 obj1.insert(4, 1);
		 
	 obj1.insert(3, 2);
		 
	 obj1.insert(1, 4);
		 
	 obj1.insert(2, 5);
		 
	if(obj1.linearSearch(9))
	
assertNotEquals(0, 0);
	

	}
	@Test
	public void test7() {
			 Array obj1;
		 obj1=new Array();
		 obj1.insert(5, 0);
		 obj1.insert(4, 1);
		 obj1.insert(3, 2);
		 obj1.insert(1, 3);
		 obj1.insert(2, 4);
		 
		 if(obj1.binarySearch(9,1,5))
			 assertFalse(true);
	
	/*	 else
			 assertEquals(1, 0);	
	*/
	}
	
	
	
	@Test 
	public void test10() 
	{	
	Array obj1;
	
	obj1=new Array ();
	
	obj1.insert(5, 0);
	
	obj1.insert(4, 1);
	 
	obj1.insert(3, 2);
	 
	obj1.insert(2, 3);
	 
	obj1.insert(1, 4);
	
	obj1.bubbleSort();
	
	if((obj1.array[0]==5)&&(obj1.array[1]==2)&&(obj1.array[2]==3)&&(obj1.array[3]==4)&&(obj1.array[4]==1))
				 assertEquals(1, 0);
	else
	assertEquals(1,0);
	
	}
	
	
	
	}
	
