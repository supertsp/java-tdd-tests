package br.com.tiagopedroso.aprendendo.testes.junit4;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

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
public class AssertJTest {

	@Test
	public void checkEquality() {
		Person person = new Person("Barack", "Obama");
		Person personClone = new Person("Barack", "Obama");
		assertThat(person).isEqualTo(personClone);
	}
	

}//class
