package br.com.tiagopedroso.aprendendo.testes.junit4;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tpenhape, 02/04/2021, 11:51:04
 * Last update: -
 */// </editor-fold>
public class Calculadora {
	
	public int somar(String expression) {
		int soma = 0;
		for (String valorParaSomar : expression.split("\\+")) {
			soma += Integer.valueOf(valorParaSomar);
		}
		
		System.out.println(soma);
		return soma;
	}

}//class
