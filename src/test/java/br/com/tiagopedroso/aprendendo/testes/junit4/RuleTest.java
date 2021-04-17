package br.com.tiagopedroso.aprendendo.testes.junit4;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author tpenhape
 */
public class RuleTest {
	
	
	@Rule
	public TemporaryFolder temporaryFolder = new TemporaryFolder();
	
	@Test
	public void shouldCreateNewFileInTemporaryFolder() throws IOException {
		File created = temporaryFolder.newFile("file.txt");
		
		assertTrue(created.isFile());
		assertEquals(temporaryFolder.getRoot(), created.getParentFile());
	}
	
	
}
