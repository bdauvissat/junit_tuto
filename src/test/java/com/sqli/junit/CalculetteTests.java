package com.sqli.junit;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class CalculetteTests {

	@Test
	public void testAddition() {
		assertEquals("Test de l'addition", BigDecimal.valueOf(10),Calculette.addition(BigDecimal.valueOf(4), BigDecimal.valueOf(6)));
	}

	@Test
	public void testSoustraction() {
		assertEquals("Test de la soustraction", BigDecimal.valueOf(7),Calculette.soustraction(BigDecimal.valueOf(10), BigDecimal.valueOf(3)));
	}

	@Test
	public void testDivision() {
		assertEquals("Test de la division", BigDecimal.valueOf(5),Calculette.division(BigDecimal.valueOf(10), BigDecimal.valueOf(2)));
	}

	@Test
	public void testMultiplication() {
		assertEquals("Test de la multiplication", BigDecimal.valueOf(50),Calculette.multiplication(BigDecimal.valueOf(10), BigDecimal.valueOf(5)));
	}

}
