package br.com.tiagopedroso.aprendendo.testes.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author tpenhape
 */
public class CalculadoraTest {
	
	public CalculadoraTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of somar method, of class Calculadora.
	 */
	@Test
	public void testSomar() {
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
	}
	
	
}
