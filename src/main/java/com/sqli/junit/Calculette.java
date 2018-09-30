package com.sqli.junit;

import java.math.BigDecimal;

public abstract class Calculette {

	/**
	 * M�thode d'addition
	 * @param val1 Premiere valeur � additionner
	 * @param val2 Seconde valeur � additionner
	 * @return R�sultat de l'op�ration
	 */
	public static BigDecimal addition(BigDecimal val1, BigDecimal val2) {
		return val1.add(val2);
	}
	
	/**
	 * M�thode de soustraction
	 * @param val1 Valeur de laquelle on va soustraire une valeur
	 * @param val2 Valeur � soustraire
	 * @return R�sultat de l'op�ration
	 */
	public static BigDecimal soustraction (BigDecimal val1, BigDecimal val2) {
		return val1.subtract(val2);
	}
	
	/**
	 * M�thode de multiplication
	 * @param val1 Premi�re valeur � multiplier
	 * @param val2 Seconde valeur � multiplier
	 * @return R�sultat de l'op�ration
	 */
	public static BigDecimal multiplication (BigDecimal val1, BigDecimal val2) {
		return val1.multiply(val2);
	}
	
	/**
	 * M�thode de division
	 * @param val1 Dividende
	 * @param val2 Diviseur
	 * @return R�sultat de l'op�ration
	 */
	public static BigDecimal division (BigDecimal val1, BigDecimal val2) {
		return val1.divide(val2);
	}
	
}
