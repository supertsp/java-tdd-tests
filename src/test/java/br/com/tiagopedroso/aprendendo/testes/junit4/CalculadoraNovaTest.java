
package br.com.tiagopedroso.aprendendo.testes.junit4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tpenhape
 */
public class CalculadoraNovaTest {

	@Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2;
		
		CalculadoraNova calculadoraNova = new CalculadoraNova();
		int soma = calculadoraNova.somar(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		CalculadoraNova calculadoraNova = new CalculadoraNova();
		int soma = calculadoraNova.somar(valorA, valorB, valorC);
		
		assertEquals(6, soma);
	}
	
}
