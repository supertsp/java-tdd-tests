package br.com.tiagopedroso.aprendendo.testes.junit4;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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
public class CalculadoraNova {
	
	public int somar(int ...valores) {
		return Arrays.stream(valores).reduce(0, (num1, num2) -> num1 + num2);
	}

}//class
