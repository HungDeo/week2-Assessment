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

public class TestArea {
	


	@Before
	public void setUp() throws Exception {
	}

	
	Rectangle rec = new Rectangle(6 , 9);
	RectangleLogic recLogic = new RectangleLogic();
	@Test
	public void testArea() {
		double a = recLogic.area(rec);
		assertEquals(54, a, 0.0);
	}
	
	Rectangle rec1 = new Rectangle(20 , 30);
	RectangleLogic recLogic1 = new RectangleLogic();
	@Test
	public void testArea1() {
		double a1 = recLogic.area(rec1);
		assertEquals(600, a1, 0.0);
	}
	
	Rectangle rec2 = new Rectangle(15 , 25);
	RectangleLogic recLogic2 = new RectangleLogic();
	@Test
	public void testArea2() {
		double a2 = recLogic.area(rec2);
		assertEquals(375, a2, 0.0);
	}

}
