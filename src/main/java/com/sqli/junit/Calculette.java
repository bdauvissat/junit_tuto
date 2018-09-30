package com.sqli.junit;

import java.math.BigDecimal;

public abstract class Calculette {

	/**
	 * Méthode d'addition
	 * @param val1 Premiere valeur à additionner
	 * @param val2 Seconde valeur à additionner
	 * @return Résultat de l'opération
	 */
	public static BigDecimal addition(BigDecimal val1, BigDecimal val2) {
		return val1.add(val2);
	}
	
	/**
	 * Méthode de soustraction
	 * @param val1 Valeur de laquelle on va soustraire une valeur
	 * @param val2 Valeur à soustraire
	 * @return Résultat de l'opération
	 */
	public static BigDecimal soustraction (BigDecimal val1, BigDecimal val2) {
		return val1.subtract(val2);
	}
	
	/**
	 * Méthode de multiplication
	 * @param val1 Première valeur à multiplier
	 * @param val2 Seconde valeur à multiplier
	 * @return Résultat de l'opération
	 */
	public static BigDecimal multiplication (BigDecimal val1, BigDecimal val2) {
		return val1.multiply(val2);
	}
	
	/**
	 * Méthode de division
	 * @param val1 Dividende
	 * @param val2 Diviseur
	 * @return Résultat de l'opération
	 */
	public static BigDecimal division (BigDecimal val1, BigDecimal val2) {
		return val1.divide(val2);
	}
	
}
