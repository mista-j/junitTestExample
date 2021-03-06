/**
 * @author Johnnie Hernandez
 * 
 * @version Assignment 5
 * <p>Csci2540Assignment 5 is a junit test for testing ComplexNum.java
 * <p>csci2540Assignment 2 & 5 is a group of methods for creating and 
 * manipulating Complex Numbers</p> 
 */
package assg5_Hernandez;


import org.junit.Test;

import junit.framework.TestCase;

public class ComplexNumTest extends TestCase{

	private double a = 2.2;
	private double b = 10.2;
	private double c = 1.1;
	private double d = 0.0;
	private ComplexNum l;
	private ComplexNum m;
	private ComplexNum n;
		
	protected void setUp() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
	}
	/**
	 * Test default constructor of ComplexNum	
	 */
	@Test
	public void testComplexNum () {
		assertEquals("0.0 should be", 0.0, l.getReal(), 0.0);
		assertEquals("0.0 should be", 0.0, l.getImaginary(), 0.0);
	}

	/**
	 * Test construct of ComplexNum (double, double)
	 */
	@Test
	public void testComplexNumDoubleDouble () {
		
		assertEquals(a + " should be", a, m.getReal(), 0.0);
		assertEquals(b + " should be", b, m.getImaginary(), 0.0);
		assertEquals(c + " should be", c, n.getReal(), 0.0);
		assertEquals(d + " should be", d, n.getImaginary(), 0.0);
	}

	/**
	 * Test ComplexNum getReal()
	 */
	@Test
	public void testGetReal () {
		
		
		assertEquals("Real of ComplexNum", 0.0, l.getReal(), 0.0);
		assertEquals("Real of ComplexNum", a, m.getReal(), 0.0);
		assertEquals("Real of ComplexNum", c, n.getReal(), 0.0);
	}

	/**
	 * Test ComplexNum getImaginary()
	 */
	@Test
	public void testGetImaginary () {
		
		assertEquals("Imaginary of ComplexNum", 0.0, l.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, m.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", d, n.getImaginary(), 0.0);

	}

	/**
	 * Test ComplexNum setReal(double)
	 */
	@Test
	public void testSetReal () {
		
		l.setReal(4);
		m.setReal(5.5);
		n.setReal(6.0);
		
		assertEquals("Real of ComplexNum", 4.0, l.getReal(), 0.0);
		assertEquals("Real of ComplexNum", 5.5, m.getReal(), 0.0);
		assertEquals("Real of ComplexNum", 6.0, n.getReal(), 0.0);
		
	}

	/**
	 * Test ComplexNum setImaginary(double)
	 */
	@Test
	public void testSetImaginary () {
		
		l.setImaginary(4);
		m.setImaginary(5.5);
		n.setImaginary(6.0);
		
		assertEquals("Imaginary of ComplexNum", 4.0, l.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", 5.5, m.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", 6.0, n.getImaginary(), 0.0);
		
	}

	/**
	 * Test ComplexNum add(ComplexNum)
	 */
	@Test
	public void testAdd () {
		
		ComplexNum r = l.add(m);
		ComplexNum s = m.add(l);
		ComplexNum t = n.add(n);
		

		assertEquals("Real of ComplexNum", a, r.getReal(), 0.0);
		assertEquals("Real of ComplexNum", a, s.getReal(), 0.0);
		assertEquals("Real of ComplexNum", (c+c), t.getReal(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, r.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, s.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", (d+d), t.getImaginary(), 0.0);		
		
	}

	/**
	 * Test ComplexNum sub(ComplexNum)
	 */
	@Test
	public void testSub () {
		
		ComplexNum r = l.sub(m);
		ComplexNum s = m.sub(l);
		ComplexNum t = n.sub(n);

		assertEquals("Real of the difference of two ComplexNum", -a, r.getReal(), 0.0);
		assertEquals("Real of the difference of two ComplexNum", a, s.getReal(), 0.0);
		assertEquals("Real of the difference of two ComplexNum", 0.0, t.getReal(), 0.0);
		assertEquals("Imaginary of the difference of two ComplexNum", -b, r.getImaginary(), 0.0);
		assertEquals("Imaginary of the difference of two ComplexNum", b, s.getImaginary(), 0.0);
		assertEquals("Imaginary of the difference of two ComplexNum", 0.0, t.getImaginary(), 0.0);		

	}

	/**
	 * Test ComplexNum mul(ComplexNum)
	 */
	@Test
	public void testMul () {
	
		ComplexNum r = l.mul(m);
		ComplexNum s = m.mul(n);
		ComplexNum t = n.mul(n);
		
		assertEquals("Multiplication of ComplexNum real", 0.0, r.getReal(), 0.0 );
		assertEquals("Multiplication of ComplexNum real", ((a*c)-(b*d)), s.getReal(), 0.0);
		assertEquals("Multiplication of ComplexNum real", ((c*c)-(d*d)), t.getReal(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", 0.0, r.getImaginary(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", ((a*d)+(b*c)), s.getImaginary(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", ((c*d)+(d*c)), t.getImaginary(), 0.0);
	}

	/**
	 * Test ComplexNum neg()
	 */
	@Test
	public void testNeg () {
		
		ComplexNum r = l.neg();
		ComplexNum s = m.neg();
		ComplexNum t = n.neg();
		

		assertEquals("Neg of Complex number real", 0.0, r.getReal(), 0.0);
		assertEquals("Neg of Complex number real", -a, s.getReal(), 0.0);
		assertEquals("Neg of Complex number real", -c, t.getReal(), 0.0);
		assertEquals("Neg of Complex number imaginary", 0.0, r.getImaginary(), 0.0);
		assertEquals("Neg of Complex number imaginary", -b, s.getImaginary(), 0.0);
		assertEquals("Neg of Complex number imaginary", -d, t.getImaginary(), 0.0);		
				
	}

	/**
	 * Test ComplexNum toString()
	 */
	@Test
	public void testToString () {
		
		assertEquals("Method toString should be", "0.0+0.0i", l.toString());
		assertEquals("Method toString should be", a + "+" + b + "i", m.toString());
		assertEquals("Method toString should be", c + "+" + d + "i", n.toString());		
		
	}

	/**
	 * Test Complex equals(ComplexNum)
	 */
	@Test
	public void testEqualsObject () {
		
		assertTrue("Should be true", l.equals(l));
		assertTrue("Should be true", m.equals(m));
		assertFalse("Should be false", n.equals(l));
		assertFalse("Should be false", n.equals(m));
		
	}

}
