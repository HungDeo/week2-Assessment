package test;

/**
 * @author DeoTheHung -The Deo
 * CIS175 Spring 2022
 * Jan 26, 2022
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;
import model.RectangleLogic;


public class TestPerimeter {
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	Rectangle rec = new Rectangle(6 , 9);
	RectangleLogic recLogic = new RectangleLogic();
	@Test
	public void testPerimeter() {
		double p = recLogic.perimeter(rec);
		assertEquals(30, p, 0.0);
	}
	
	
	Rectangle rec1 = new Rectangle(20 , 30);
	RectangleLogic recLogic1 = new RectangleLogic();
	@Test
	public void testPerimeter1() {
		double p1 = recLogic.perimeter(rec1);
		assertEquals(100, p1, 0.0);
	}
	
	
	Rectangle rec2 = new Rectangle(15 , 25);
	RectangleLogic recLogic2 = new RectangleLogic();
	@Test
	public void testPerimeter2() {
		double p2 = recLogic.perimeter(rec2);
		assertEquals(80, p2, 0.0);
	}

}
