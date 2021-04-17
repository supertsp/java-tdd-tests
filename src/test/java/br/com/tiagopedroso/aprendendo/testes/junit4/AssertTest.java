package br.com.tiagopedroso.aprendendo.testes.junit4;

import static org.junit.Assert.*;
import org.junit.Test;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tpenhape, 02/04/2021, 12:03:05
 * Last update: -
 */// </editor-fold>
public class AssertTest {

	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();		 
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
	
	@Test
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object());
	}
	
	@Test
	public void testAssertNull() {
		assertNull(null);
	}
	
	@Test
	public void testAssertSame() {
		Integer number = Integer.valueOf(10);
		assertSame(number, number);
	}
	

}//class
