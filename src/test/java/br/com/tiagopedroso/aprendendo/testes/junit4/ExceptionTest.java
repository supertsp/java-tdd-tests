package br.com.tiagopedroso.aprendendo.testes.junit4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author tpenhape
 */
public class ExceptionTest {
		
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldCreateNewFileInTemporaryFolder() {
		int[] numbers = new int[1];
		numbers[3] = 10;
	}
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<>();
		
		expectedException.expect(IndexOutOfBoundsException.class);
		expectedException.expectMessage("Index: 0, Size: 0");		
		list.get(0);
	}
	
	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançado");
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
	}
	
	
}
