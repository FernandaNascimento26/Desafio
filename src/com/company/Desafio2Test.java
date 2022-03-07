package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Desafio2Test {

	@Test
	public void testCalcDiff() {
		int vet [] = {1,2,3,4,5};
		

		int x = 2;

		assertEquals(3, Desafio2.calcDiff(vet, x));
	}

}
