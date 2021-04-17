package br.com.tiagopedroso.aprendendo.testes.junit4;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
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
public class MatcherTest {

	@Test
	public void givenBean_checkToString() {
		Person person = new Person("Barack", "Obama");
		String textName = person.toString();
		assertThat(person, HasToString.hasToString(textName));
	}
	
	@Test
	public void givenBean_checkPropertyExists() {
		Person person = new Person("Barack", "Obama");
		assertThat(person, HasProperty.hasProperty("name"));
	}
	
	@Test
	public void givenCollection_checkEmpty() {
		List<String> emptyList = new ArrayList<>();
		assertThat(emptyList, Matchers.empty());
	}
	
	@Test
	public void givenAnInteger_checkGreater() {
		assertThat(1, Matchers.greaterThan(0));
	}
	
	@Test
	public void givenString_checkNull() {
		String text = null;
		assertThat(text, Matchers.isEmptyOrNullString());
	}
	

}//class
