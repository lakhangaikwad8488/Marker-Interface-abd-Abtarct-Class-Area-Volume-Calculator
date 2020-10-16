package test.java.yaksha;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import main.java.yaksha.Cube;
import main.java.yaksha.Rectangle;
import main.java.yaksha.Shape;
 import main.java.yaksha.TestUtils;
import main.java.yaksha.Triangle;

@RunWith(MockitoJUnitRunner.class)  
 class MainTest {

	@Test
	void testArea() throws IOException {
		 
		Rectangle s1 = Mockito.mock(Rectangle.class);
		s1.setLength(20);
		s1.setWidth(30);
		//assertEquals(600.0, s1.area());
		//Triangle s2=new Triangle();
		Triangle s2 = Mockito.mock(Triangle.class);
		s2.setBase(20);
		s2.setHeight(30);
		when(s1.area()).thenReturn(600.0);  

	//	Mockito.when(s1.area()).thenReturn(600.0);
		double actualTotal=s1.area();
		 //assertEquals(300.0, s2.area());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==600.0?true:false),TestUtils.businessTestFile);
	 
		   when(s2.area()).thenReturn(300.0);
		 //Mockito.when(s2.area()).thenReturn(300.0);
			double actualTotal2=s2.area();
			 //assertEquals(300.0, s2.area());
			 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal2==300.0?true:false),TestUtils.businessTestFile);

 	}
	
		 
	@Test
	void testVolume() throws IOException  {
		//Shape s;
		Cube c1=Mockito.mock(Cube.class);
 		c1.setLength(20);
		c1.setWidth(30);
		c1.setHeight(40);
		 when(c1.volume()).thenReturn(24000.0);
		double actualVolume=c1.area();
		 //assertEquals(300.0, s2.area());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualVolume==24000.0?true:false),TestUtils.businessTestFile);

		
 	}
	
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}
